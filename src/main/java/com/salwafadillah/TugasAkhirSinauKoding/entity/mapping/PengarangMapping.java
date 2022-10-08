package com.salwafadillah.TugasAkhirSinauKoding.entity.mapping;

import com.salwafadillah.TugasAkhirSinauKoding.entity.Pengarang;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.PengarangDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PengarangMapping {
    PengarangMapping instance = Mappers.getMapper(PengarangMapping.class);

    Pengarang toEntity(PengarangDTO dto);

    PengarangDTO toDto(Pengarang param);

    List<PengarangDTO> toListDto   (List<Pengarang> pengarangList);
}
