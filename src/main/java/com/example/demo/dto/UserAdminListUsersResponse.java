package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.UserDetails;

import lombok.Data;

@Data
public class UserAdminListUsersResponse {
    
    private String requestBy;
    private List<UserDetails> userDetailsList;

}
