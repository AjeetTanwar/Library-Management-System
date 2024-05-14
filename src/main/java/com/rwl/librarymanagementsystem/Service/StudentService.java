package com.rwl.librarymanagementsystem.Service;


import com.rwl.librarymanagementsystem.DTOs.NewStudentRequestDto;
import com.rwl.librarymanagementsystem.DTOs.UpdateStudentEmailRequestDto;
import com.rwl.librarymanagementsystem.DTOs.UpdateStudentEmailResponseDto;
import com.rwl.librarymanagementsystem.Entity.LibraryCard;
import com.rwl.librarymanagementsystem.Entity.Student;
import com.rwl.librarymanagementsystem.Enum.CardStatus;
import com.rwl.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public int addStudent(NewStudentRequestDto studentRequestDto){

        //creating new student object and setting the parameters
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setEmail(studentRequestDto.getEmail());

        //creating and activating library card object and adding it to student object
        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.Activated);
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);

        return student.getId();
    }

    public Student findStudentByEmail(String email){
        try {
            return studentRepository.findByEmail(email);
        }
        catch (Exception e){
            return new Student();
        }
    }

    public UpdateStudentEmailResponseDto updateEmail(UpdateStudentEmailRequestDto updateStudentEmailRequestDto){
        Student student = studentRepository.findById(updateStudentEmailRequestDto.getId());

        student.setEmail(updateStudentEmailRequestDto.getNewEmail());

        Student updatedStudent = studentRepository.save(student);

        UpdateStudentEmailResponseDto updateStudentEmailResponseDto = new UpdateStudentEmailResponseDto();
        updateStudentEmailResponseDto.setId(updatedStudent.getId());
        updateStudentEmailResponseDto.setName(updatedStudent.getName());
        updateStudentEmailResponseDto.setNewEmail(updatedStudent.getEmail());

        return updateStudentEmailResponseDto;

    }
}
