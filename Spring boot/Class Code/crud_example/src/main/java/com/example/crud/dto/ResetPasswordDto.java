package com.example.crud.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResetPasswordDto {

    private String email;
    private String mobileNumber;
    private String oldPassword;
    private String newPassword;

}
