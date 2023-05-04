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
public class UserDto {
    private String Name;
    private String surname;
    private int age;
    private LocalDateTime CreatedDateTime;
    private LocalDateTime UpdateDateTime;
    private LocalDateTime LastModifiedDateTime;

}
