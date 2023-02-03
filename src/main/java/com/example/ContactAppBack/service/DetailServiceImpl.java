package com.example.ContactAppBack.service;

import com.example.ContactAppBack.domain.ContactDTO;
import com.example.ContactAppBack.domain.DetailDTO;
import com.example.ContactAppBack.mapper.DetailMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DetailServiceImpl implements DetailService {
    private final DetailMapper mapper;
    @Override
    public List<DetailDTO> allList(int userNo){
        return mapper.detailAll(userNo);
    }
    @Override
    public List<DetailDTO> companyList(int userNo){
        return mapper.companyAll(userNo);
    }
    @Override
    public List<DetailDTO> companyDetailList(int userNo, String companyName) { return mapper.companyDetailAll(userNo, companyName);}
    @Override
    public void detailInsert(DetailDTO detail) {
        mapper.detailInsert(detail);
    }
    @Override
    public void companyInsert(DetailDTO detail) { mapper.companyInsert(detail); }
    @Override
    public void companyDetailInsert(DetailDTO detail) { mapper.companyDetailInsert(detail); }
    public void detailUpdate(DetailDTO detail) {
        mapper.detailUpdate(detail);
    }
    @Override
    public void detailDelete(DetailDTO detail) {
        mapper.detailDelete(detail);
    }
    public void companyDelete(int detailNo) {
        mapper.detailCompanyDelete(detailNo);
    }
    public void detailCompleteDeletion(int detailNo) { mapper.detailCompleteDeletion(detailNo);}

}
