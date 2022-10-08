package com.salwafadillah.TugasAkhirSinauKoding.service;

import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.AuthenticationDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.ResponseAuthDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.UserDTO;

public interface AuthService {
    ResponseAuthDTO register(UserDTO data);

    ResponseAuthDTO login(AuthenticationDTO data);
}