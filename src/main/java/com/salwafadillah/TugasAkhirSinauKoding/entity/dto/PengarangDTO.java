package com.salwafadillah.TugasAkhirSinauKoding.entity.dto;

import com.salwafadillah.TugasAkhirSinauKoding.entity.mapping.PengarangMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PengarangDTO {
    public static PengarangMapping instance;
    private Long id;

    private String nama;

    private String alamat;

    private String telp;
}

