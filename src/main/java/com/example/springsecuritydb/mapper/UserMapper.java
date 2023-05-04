package com.example.springsecuritydb.mapper;
import com.example.springsecuritydb.mapper.UserMapper;
import com.example.springsecuritydb.dao.entity.RoleEntity;
import com.example.springsecuritydb.dao.entity.UserEntity;
import com.example.springsecuritydb.dto.RoleDto;
import com.example.springsecuritydb.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public abstract class UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract UserDto entityToDto(UserEntity userEntity);
    public abstract List<UserDto> entityToDtoList(List<UserEntity> userEntityList);

    public abstract UserEntity dtoToEntity(UserDto userDto);
}
