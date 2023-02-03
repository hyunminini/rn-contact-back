package com.example.ContactAppBack.domain;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Data
public class ContactDTO {
    private int userNo;
    private String name;
    private String phoneNumber;
    private String email;
    private String status;
    private String createTime;
    private String deleteTime;
    private String deleteIp;
}
