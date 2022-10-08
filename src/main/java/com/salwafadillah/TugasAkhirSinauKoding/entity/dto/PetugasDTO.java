package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetugasDTO {
    private Long id;

    private String nama;

    private String telp;

    private String alamat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserDTO user;
}