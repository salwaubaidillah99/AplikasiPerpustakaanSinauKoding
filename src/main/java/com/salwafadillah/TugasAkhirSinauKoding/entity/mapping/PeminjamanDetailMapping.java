package com.salwafadillah.TugasAkhirSinauKoding.entity.mapping;

import com.salwafadillah.TugasAkhirSinauKoding.entity.PeminjamanDetail;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.PeminjamanDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PeminjamanDetailMapping {
    PeminjamanDetailMapping instance = Mappers.getMapper(PeminjamanDetailMapping.class);

    PeminjamanDetail toEntity(PeminjamanDetailDTO dto);

    PeminjamanDetailDTO toDto(PeminjamanDetail param);

    List<PeminjamanDetailDTO> toListDto   (List<PeminjamanDetail> peminjamanDetailList);
}