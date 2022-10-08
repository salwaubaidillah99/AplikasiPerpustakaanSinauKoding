package com.salwafadillah.TugasAkhirSinauKoding.service;

import com.salwafadillah.TugasAkhirSinauKoding.entity.Penerbit;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.PenerbitDTO;

import java.util.List;

public interface PenerbitService {
    PenerbitDTO save(PenerbitDTO param);

    List<PenerbitDTO> findAllData();

    PenerbitDTO update(PenerbitDTO param, Long id);

    Boolean delete(Long id);

    PenerbitDTO findById(Long id);
}

