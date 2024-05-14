package com.rwl.librarymanagementsystem.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateStudentEmailRequestDto {

    private int id;
    private String newEmail;
}
