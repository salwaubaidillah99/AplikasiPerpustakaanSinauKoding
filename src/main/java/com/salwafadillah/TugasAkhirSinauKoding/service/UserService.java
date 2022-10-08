package com.salwafadillah.TugasAkhirSinauKoding.service;


import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO findByUsername(String username);

    List<UserDTO> getAllData();
}