package com.example.springsecuritydb.controller;

import com.example.springsecuritydb.dto.RoleDto;
import com.example.springsecuritydb.dto.UserDto;
import com.example.springsecuritydb.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleDto> getRoles(){
        return roleService.getRoles();
    }

    @GetMapping("{id}")
    public RoleDto getRole(@PathVariable Long id){
        return roleService.getRole(id);
    }

    @PostMapping
    public String addRole(RoleDto roleDto){
    roleService.addRole(roleDto);
        return "Elave edildi!";
    }
}
