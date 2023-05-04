package com.example.springsecuritydb.mapper;

import com.example.springsecuritydb.dao.entity.RoleEntity;
import com.example.springsecuritydb.dto.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public abstract class RoleMapper {

    public static final RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    public abstract RoleDto entityToDto(RoleEntity roleEntity);
    public abstract List<RoleDto> entityToDtoList(List<RoleEntity> roleEntities);

    public abstract RoleEntity dtoToEntity(RoleDto roleDto);
}
