package com.kma.project.chatapp.dto.response.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@SuperBuilder
public class JwtResponse {

    private String accessToken;

    private String refreshToken;

    private String type = "Bearer";

    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    private String expiredAccessDate;

    private String expiredRefreshDate;

    private Boolean isFillProfileKey;


    public JwtResponse(String accessToken, String refreshToken, Long id, String username, String email, List<String> roles) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
