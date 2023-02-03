package com.example.ContactAppBack.mapper;
import com.example.ContactAppBack.domain.ContactDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ContactMapper {
    List<ContactDTO> selectAll();
    void contactInsert(ContactDTO contact);
    void contactUpdate(ContactDTO contact);
    void contactDelete(ContactDTO contact);
    void contactRestoration(ContactDTO contact);
    void contactCompleteDeletion(@Param("userNo") int userNo);

    List<ContactDTO> deleteAll();

}
