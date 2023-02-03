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
    @Override
    public void contactInsert(ContactDTO contact) {
        mapper.contactInsert(contact);
    }
    @Override
    public void contactUpdate(ContactDTO contact) {
        mapper.contactUpdate(contact);
    }
    @Override
    public void contactDelete(ContactDTO contact) {
        mapper.contactDelete(contact);
    }
    @Override
    public void contactRestoration(ContactDTO contact) {
        mapper.contactRestoration(contact);
    }
    public void contactCompleteDeletion(int userNo) { mapper.contactCompleteDeletion(userNo);}
    @Override
    public List<ContactDTO> deleteAllList() { return  mapper.deleteAll(); }

}
