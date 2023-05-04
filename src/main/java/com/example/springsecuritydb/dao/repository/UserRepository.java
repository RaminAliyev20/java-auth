package com.example.springsecuritydb.dao.repository;

import com.example.springsecuritydb.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findByName(String userName);
}
