package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.salwafadillah.TugasAkhirSinauKoding.entity.mapping.PenerbitMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenerbitDTO {
    public static PenerbitMapping instance;
    private Long id;

    private String nama;

    private String alamat;

    private String telp;
}
