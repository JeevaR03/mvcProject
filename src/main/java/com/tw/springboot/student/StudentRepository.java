package com.tw.springboot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //@Query("SELECT s FROM Student s WHERE s.studentEmail=?1")
   //ß Optional<Student> findStudentByEmail(String studentEmail);

}
