package com.api.backendtesteeureka.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponseDTO {

    private String token;
    private String type = "Bearer";
    private Long id;
    private String nome;
    private String email;
    private List<String> roles;


    public JwtResponseDTO(String accessToken, Long id, String nome, String email, List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.roles = roles;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }



}
