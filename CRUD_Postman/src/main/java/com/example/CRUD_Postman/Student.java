package com.example.CRUD_Postman;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "email")
	private String email;
	
	
	public Student () {
		
	}
	
	public Student(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + " " + age + " éves diák, email címe: " + email;
	}

	
	
	
	

}
