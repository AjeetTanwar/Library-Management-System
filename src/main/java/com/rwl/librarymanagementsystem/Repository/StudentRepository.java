package com.rwl.librarymanagementsystem.Repository;


import com.rwl.librarymanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

    Student findById(int id);
}
