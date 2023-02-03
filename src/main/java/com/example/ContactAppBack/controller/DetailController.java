package com.example.ContactAppBack.controller;

import com.example.ContactAppBack.domain.DetailDTO;
import com.example.ContactAppBack.service.DetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/detail")
@RequiredArgsConstructor
@Slf4j
public class DetailController {
    private final DetailService service;

    @GetMapping("/all/{userNo}")
    public List<DetailDTO> detailList(@PathVariable int userNo){
        return service.allList(userNo);
    }

    @GetMapping("/companyAll/{userNo}")
    public List<DetailDTO> companyList(@PathVariable int userNo){
        return service.companyList(userNo);
    }
    @GetMapping("/companyDetailAll/{userNo}/{companyName}")
    public List<DetailDTO> companyDetailList(@PathVariable int userNo, @PathVariable String companyName){
        return service.companyDetailList(userNo, companyName);
    }

    @PostMapping("/add")
    void insertContactData(@RequestBody DetailDTO detail) {
        service.detailInsert(detail);
        System.out.println("상세정보 DB 저장 성공");
    }

    @PostMapping("/company/add")
    void insertCompanyData(@RequestBody DetailDTO detail) {
        service.companyInsert(detail);
        System.out.println("회사정보 DB 저장 성공");
    }

    @PostMapping("/companyDetail/add")
    void insertCompanyDetailData(@RequestBody DetailDTO detail) {
        service.companyDetailInsert(detail);
        System.out.println("회사상세정보 DB 저장 성공");
    }
    @PutMapping("/{detailNo}")
    public void detailUpdate(@PathVariable int detailNo, @RequestBody DetailDTO detail) {
        DetailDTO detailUpdate = detail;
        System.out.println("업데이트 상세정보 => " + detailUpdate);

        detailUpdate.setDetailNo(detail.getDetailNo());
        detailUpdate.setTitle(detail.getTitle());
        detailUpdate.setContent(detail.getContent());

        service.detailUpdate(detail);
    }

    @DeleteMapping("delete/{detailNo}")
    public void contactDetailDeletion(@PathVariable int detailNo) {
        service.detailCompleteDeletion(detailNo);
    }

    @DeleteMapping("delete/company/{detailNo}")
    public void companyDetailDeletion(@PathVariable int detailNo) {
        service.companyDelete(detailNo);
    }
}
