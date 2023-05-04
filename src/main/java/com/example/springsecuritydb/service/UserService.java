package com.example.springsecuritydb.service;

import com.example.springsecuritydb.dao.entity.UserEntity;
import com.example.springsecuritydb.dao.repository.UserRepository;
import com.example.springsecuritydb.dto.UserDto;
import com.example.springsecuritydb.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers(){
        return UserMapper.INSTANCE.entityToDtoList((List<UserEntity>) userRepository.findAll());
    }

    public UserDto getUser(Long id){
        return UserMapper.INSTANCE.entityToDto(userRepository.findById(id).orElseThrow());
    }

    public void addUser(UserDto userDto){
        userRepository.save(UserMapper.INSTANCE.dtoToEntity(userDto));
    }
}
