package com.example.ContactAppBack.service;

import com.example.ContactAppBack.domain.DetailDTO;
import java.util.List;
public interface DetailService {
    List<DetailDTO> allList(int userNo);
    List<DetailDTO> companyList(int userNo);
    List<DetailDTO> companyDetailList(int userNo, String companyName);
    public void detailInsert(DetailDTO detail);
    public void companyInsert(DetailDTO detail);
    public void companyDetailInsert(DetailDTO detail);
    public void detailUpdate(DetailDTO detail);
    public void detailDelete(DetailDTO detail);
    public void companyDelete(int detailNo);
    public void detailCompleteDeletion(int detailNo);
}
