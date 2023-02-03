package com.example.ContactAppBack.service;

import com.example.ContactAppBack.domain.ContactDTO;
import java.util.List;

public interface ContactService {
    List<ContactDTO> allList();
    public void contactInsert(ContactDTO contact);
    public void contactUpdate(ContactDTO contact);
    public void contactDelete(ContactDTO contact);
    public void contactRestoration(ContactDTO contact);
    public void contactCompleteDeletion(int t_userNo);
    List<ContactDTO> deleteAllList();


//    public void contactDelete(ContactDTO contact);
//    public void contactDelete(int userNo);
}
