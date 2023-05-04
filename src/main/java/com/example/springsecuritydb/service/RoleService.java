package com.example.springsecuritydb.service;

import com.example.springsecuritydb.dao.entity.RoleEntity;
import com.example.springsecuritydb.dao.repository.RoleRepository;
import com.example.springsecuritydb.dto.RoleDto;
import com.example.springsecuritydb.dto.UserDto;
import com.example.springsecuritydb.mapper.RoleMapper;
import com.example.springsecuritydb.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleDto> getRoles(){
        return RoleMapper.INSTANCE.entityToDtoList((List<RoleEntity>) roleRepository.findAll());
    }

    public RoleDto getRole(Long id){
        return RoleMapper.INSTANCE.entityToDto(roleRepository.findById(id).orElseThrow());
    }

    public void addRole(RoleDto roleDto){
        roleRepository.save(RoleMapper.INSTANCE.dtoToEntity(roleDto));
    }
}
