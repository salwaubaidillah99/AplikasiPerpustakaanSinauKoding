package com.salwafadillah.TugasAkhirSinauKoding.controller;

import com.salwafadillah.TugasAkhirSinauKoding.common.Response;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.AuthenticationDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.ResponseAuthDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.UserDTO;
import com.salwafadillah.TugasAkhirSinauKoding.service.Impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthServiceImpl service;

    @PostMapping("/login")
    public Response login(@RequestBody AuthenticationDTO dto){
        ResponseAuthDTO data = service.login(dto);
        return new Response(data, data != null ? "Login Berhasil" : "Login Gagal", HttpStatus.OK);
    }

    @PostMapping("/register")
    public Response register(@RequestBody UserDTO dto){
        ResponseAuthDTO data = service.register(dto);
        return new Response(data, data != null ? "Registrasi Berhasil" : "Registrasi Gagal", HttpStatus.OK);
    }
}