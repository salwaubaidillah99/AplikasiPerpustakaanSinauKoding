package com.salwafadillah.TugasAkhirSinauKoding.service;

import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.PengembalianDTO;

import java.util.List;

public interface PengembalianService {
    PengembalianDTO save(PengembalianDTO param);

    List<PengembalianDTO> findAllData();

    PengembalianDTO update(PengembalianDTO param, Long id);

    Boolean delete(Long id);

    PengembalianDTO findById(Long id);
}