package com.example.ContactAppBack.mapper;
import com.example.ContactAppBack.domain.ContactDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ContactMapper {
    List<ContactDTO> selectAll();
}
