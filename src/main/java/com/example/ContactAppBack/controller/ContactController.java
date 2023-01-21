package com.example.ContactAppBack.controller;
import com.example.ContactAppBack.domain.ContactDTO;
import com.example.ContactAppBack.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService service;
    @GetMapping("/all")
    public List<ContactDTO> boardList(){
        return service.allList();
    }

//    @PostMapping("/add")
//    void insertContactData(@RequestBody ContactDTO contact) {
//
//    }
}
