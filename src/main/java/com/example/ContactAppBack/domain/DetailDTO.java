package com.example.ContactAppBack.domain;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Data
public class DetailDTO {
    private int detailNo;
    private int userNo;
    private String companyName;
    private String title;
    private String content;
    private String detailCreateTime;
    private String classification;

}
