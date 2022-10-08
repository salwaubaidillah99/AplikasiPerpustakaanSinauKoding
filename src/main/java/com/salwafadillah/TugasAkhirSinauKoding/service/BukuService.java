package com.salwafadillah.TugasAkhirSinauKoding.service;

import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.BukuDTO;
import java.util.List;

public interface BukuService {
    BukuDTO save(BukuDTO param);

    List<BukuDTO> findAllData();

    BukuDTO update(BukuDTO param, Long id);

    Boolean delete(Long id);

    BukuDTO findById(Long id);
}