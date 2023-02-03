package com.example.ContactAppBack.controller;
import com.example.ContactAppBack.domain.ContactDTO;
import com.example.ContactAppBack.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
@Slf4j
public class ContactController {
    private final ContactService service;
    @GetMapping("/all")
    public List<ContactDTO> userList(){
        return service.allList();
    }

    @PostMapping("/add")
    void insertContactData(@RequestBody ContactDTO contact) {
        service.contactInsert(contact);
        System.out.println("유저 DB 저장 성공");
    }

    @PutMapping("/{userNo}")
    public void contactUpdate(@PathVariable int userNo, @RequestBody ContactDTO contact) {
        ContactDTO contactUpdate = contact;
        System.out.println("업데이트유저 => " + contactUpdate);

        contactUpdate.setUserNo((contact.getUserNo()));
        contactUpdate.setName(contact.getName());
        contactUpdate.setPhoneNumber(contact.getPhoneNumber());
        contactUpdate.setEmail(contact.getEmail());

        service.contactUpdate(contact);
    }

    @PutMapping("/delete/{userNo}")
    public void contactDelete(@PathVariable int userNo, @RequestBody ContactDTO contact) {
        ContactDTO contactDelete = contact;
        System.out.println("삭제(저장) 유저 => " + contactDelete);
        contactDelete.setUserNo(contact.getUserNo());
        contactDelete.setStatus(contact.getStatus());
        service.contactDelete(contact);
    }
    @PutMapping("/delete/Restoration/{userNo}")
    public void contactRestoration(@PathVariable int userNo, @RequestBody ContactDTO contact) {
        ContactDTO contactRestoration = contact;
        System.out.println("삭제(복구) 유저 => " + contactRestoration);
        contactRestoration.setUserNo(contact.getUserNo());
        contactRestoration.setStatus(contact.getStatus());
        service.contactRestoration(contact);
    }
    @GetMapping("delete/all")
    public List<ContactDTO> deleteList(){
        return service.deleteAllList();
    }

    @DeleteMapping("delete/{userNo}")
    public void contactCompleteDeletion(@PathVariable int userNo) {
        service.contactCompleteDeletion(userNo);
    }


}
