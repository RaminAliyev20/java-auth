package com.example.springsecuritydb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private String Name;
    private LocalDateTime CreatedDateTime;
    private LocalDateTime UpdateDateTime;
    private LocalDateTime LastModifiedDateTime;

}
