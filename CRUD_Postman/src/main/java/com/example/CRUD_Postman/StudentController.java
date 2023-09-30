package com.example.CRUD_Postman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	private StudentService studentService;
	
	@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
	
	@GetMapping
     public Iterable<Student> students(){
        return studentService.getStudents();
    } 
	
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@PutMapping
	public void updateStudent(Long id, @RequestBody Student student) {
		if(student.getId() == null){
	    student.setId(id);
	    }
		System.out.println(id);
	studentService.saveStudent(student);	
	}
	
	@DeleteMapping
	public void deleteStudent(@RequestBody Student student) {
	studentService.deleteStudent(student.getId());
	}
}