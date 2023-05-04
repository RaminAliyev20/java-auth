package com.example.springsecuritydb.dao.repository;

import com.example.springsecuritydb.dao.entity.RoleEntity;
import com.example.springsecuritydb.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity,Long> {
}
