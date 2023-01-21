package com.example.ContactAppBack.service;

import com.example.ContactAppBack.domain.ContactDTO;
import com.example.ContactAppBack.mapper.ContactMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactMapper mapper;

    @Override
    public List<ContactDTO> allList(){
        return mapper.selectAll();
    }
}
