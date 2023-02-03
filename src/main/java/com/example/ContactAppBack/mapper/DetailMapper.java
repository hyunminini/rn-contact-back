package com.example.ContactAppBack.mapper;

import com.example.ContactAppBack.domain.ContactDTO;
import com.example.ContactAppBack.domain.DetailDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DetailMapper {
    List<DetailDTO> detailAll(int userNo);
    List<DetailDTO> companyAll(int userNo);
    List<DetailDTO> companyDetailAll(int userNo, String companyName);
    void detailInsert(DetailDTO detail);
    void companyInsert(DetailDTO detail);
    void companyDetailInsert(DetailDTO detail);
    void detailUpdate(DetailDTO detail);
    void detailDelete(DetailDTO detail);
    void detailCompanyDelete(@Param("detailNo") int detailNo);
    void detailCompleteDeletion(@Param("detailNo") int detailNo);

}
