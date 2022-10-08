package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.salwafadillah.TugasAkhirSinauKoding.entity.mapping.UserMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    public static UserMapping instance;
    private Long id_user;

    private String username;

    private String password;

    private String email;

    private String role;
}