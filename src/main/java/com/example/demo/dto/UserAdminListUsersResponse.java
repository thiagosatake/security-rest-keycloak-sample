package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.AppUserDetails;

import lombok.Data;

@Data
public class UserAdminListUsersResponse {
    
    private String requestBy;
    private List<AppUserDetails> userDetailsList;

}
