package com.salwafadillah.TugasAkhirSinauKoding.service.Impl;

import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.UserDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.mapping.UserMapping;
import com.salwafadillah.TugasAkhirSinauKoding.repository.UserRepository;
import com.salwafadillah.TugasAkhirSinauKoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO findByUsername(String username) {
        return UserMapping.instance.toDto(repository.findByUsername(username));
    }

    @Override
    public List<UserDTO> getAllData() {
        return UserMapping.instance.toListDto(repository.findAll());
    }
}
