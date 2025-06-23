package com.example.studentMaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	public Student getById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Long id, Student studentDetail) {
		Student student = studentRepository.findById(id).orElse(null);
		if(student != null) {
			student.setStud_name(studentDetail.getStud_name());
			student.setStud_department(studentDetail.getStud_department());
			student.setStud_age(studentDetail.getStud_age());
			return studentRepository.save(student);
		}
		return null;
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
