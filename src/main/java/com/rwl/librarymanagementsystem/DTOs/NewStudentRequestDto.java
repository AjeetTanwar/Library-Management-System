package com.rwl.librarymanagementsystem.DTOs;

import com.rwl.librarymanagementsystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewStudentRequestDto {
    private String name;
    private String email;
    private int age;
    private Department department;
}
