package com.salwafadillah.TugasAkhirSinauKoding.entity.mapping;

import com.salwafadillah.TugasAkhirSinauKoding.entity.User;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.ResponseAuthDTO;
import com.salwafadillah.TugasAkhirSinauKoding.entity.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapping {
    UserMapping instance = Mappers.getMapper(UserMapping.class);

    User toEntity(UserDTO dto);

    UserDTO toDto(User param);

    List<UserDTO> toListDto(List<User> data);

    ResponseAuthDTO fromEntityToResponseDto(User data);

    ResponseAuthDTO fromDtoToResponseDto(UserDTO data);
}
