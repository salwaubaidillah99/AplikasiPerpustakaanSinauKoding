package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAuthDTO {
    private Long id_user;

    private String username;

    private String email;

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String token;

}
