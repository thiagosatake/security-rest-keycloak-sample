/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDetailResponse;
import com.example.demo.model.AppUserDetails;


@RestController
@RequestMapping(path = "/user")
public class UserDetailsController {

    
    @GetMapping("/profile")
    public ResponseEntity<UserDetailResponse> profile(@AuthenticationPrincipal Jwt jwt) {
        UserDetailResponse response = new UserDetailResponse();

        AppUserDetails myUserDetailsResponse = new AppUserDetails();
        myUserDetailsResponse.setId(jwt.getId());        
        myUserDetailsResponse.setName(jwt.getClaimAsString("name"));
        myUserDetailsResponse.setGivenName(jwt.getClaimAsString("given_name"));
        myUserDetailsResponse.setFamilyName(jwt.getClaimAsString("family_name"));
        myUserDetailsResponse.setPreferredName(jwt.getClaimAsString("preferred_username"));
        myUserDetailsResponse.setEmail(jwt.getClaimAsString("email"));
        
        response.setProfile(myUserDetailsResponse);

        return ResponseEntity.ok(response);
    }

}
