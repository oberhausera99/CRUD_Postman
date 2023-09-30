package com.example.CRUD_Postman;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public void saveStudent(Student s) {
    	studentRepository.save(s);
    	System.out.println("Sikeresen hozzáadva / módosítva " + s.toString());
    }
    
    public List<Student> getStudents() {
    	return studentRepository.findAll();
    }
    
    public void deleteStudent(long id) {
    	studentRepository.deleteById(id);
    	System.out.print(studentRepository.findById(id).toString() + "sikeresen törölve");
    }
    
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

}
