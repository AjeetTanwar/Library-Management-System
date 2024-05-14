package com.rwl.librarymanagementsystem.Controller;


import com.rwl.librarymanagementsystem.DTOs.NewStudentRequestDto;
import com.rwl.librarymanagementsystem.DTOs.UpdateStudentEmailRequestDto;
import com.rwl.librarymanagementsystem.DTOs.UpdateStudentEmailResponseDto;
import com.rwl.librarymanagementsystem.Entity.Student;
import com.rwl.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public int addStudent(@RequestBody NewStudentRequestDto studentRequestDto){
        return studentService.addStudent(studentRequestDto);
    }

    @GetMapping("/find_by_email")
    public Student findStudentByName(@RequestParam("email") String email){
        return studentService.findStudentByEmail(email);
    }

    @PutMapping("/update_Email")
    public UpdateStudentEmailResponseDto updateEmail(@RequestBody UpdateStudentEmailRequestDto updateStudentEmailRequestDto){
        return studentService.updateEmail(updateStudentEmailRequestDto);
    }
}
