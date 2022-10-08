package com.salwafadillah.TugasAkhirSinauKoding.service.Impl;

import com.salwafadillah.TugasAkhirSinauKoding.entity.Pengarang;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.PengarangDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.mapping.PengarangMapping;
import com.salwafadillah.TugasAkhirSinauKoding.repository.PengarangRepository;
import com.salwafadillah.TugasAkhirSinauKoding.service.PengarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
public class PengarangServiceImpl implements PengarangService {
    @Autowired
    private PengarangRepository repository;

    @Transactional
    @Override
    public PengarangDTO save(PengarangDTO param) {
        Pengarang data = repository.save(PengarangMapping.instance.toEntity(param));
        return PengarangMapping.instance.toDto(data);
    }

    @Transactional
    @Override
    public List<PengarangDTO> findAllData() {
        return PengarangMapping.instance.toListDto(repository.findAll());
    }

    @Transactional
    @Override
    public PengarangDTO update(PengarangDTO param, Long id) {
        Pengarang data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setNama(param.getNama() == null ? data.getNama() : param.getNama());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());
            data.setTelp(param.getTelp() != null ? param.getTelp() : data.getTelp());

            return PengarangMapping.instance.toDto(repository.save(data));
        }

        return PengarangMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Pengarang data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PengarangDTO findById(Long id) {
        return PengarangMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}