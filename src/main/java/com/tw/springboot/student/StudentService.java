package com.tw.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}



	public List<Student> getStudents(){
        return studentRepository.findAll();
    }

	public void addNewStudent( Student student) {
		studentRepository.save(student);

	}

	public void deleteStudent(Long studentId) {
		boolean exist=studentRepository.existsById(studentId);
		if(!exist){
			throw new IllegalStateException("Id Not exist");
		}
		studentRepository.deleteById(studentId);
	}
}
