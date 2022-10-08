package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnggotaDTO {
    private Long id;

    private String nama;

    private String jenisKelamin;

    private String alamat;

    private String telp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserDTO user;
}