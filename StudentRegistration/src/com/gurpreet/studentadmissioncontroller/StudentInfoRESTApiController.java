package com.gurpreet.studentadmissioncontroller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentInfoRESTApiController {

	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> getStudentList() {

//		Java Business Logic
		Student student1 = new Student();
		student1.setStudentName("sam");

		Student student2 = new Student();
		student2.setStudentName("Gurpreet");

		Student student3 = new Student();
		student3.setStudentName("Bob");

		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		return studentList;
	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String studentName) {

//		Java Business Logic
		Student s = new Student();
		s.setStudentName(studentName);
		s.setStudentHobby("WWE");
		return s;

	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName,
			@RequestBody Student student) {

//		Java Business Logic
		System.out.println(studentName);
		System.out.println(student.getStudentName() + "     " + student.getStudentHobby());

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("key1", "value1");
		httpHeaders.add("key2", "value2");

		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);
	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postStudent(@RequestBody Student student) {

//		Java Business Logic
		System.out.println(student.getStudentName() + "     " + student.getStudentHobby());

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}")
				.buildAndExpand(student.getStudentName()).toUri().toString());

		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String studentName) {

//		Java Business Logic
		System.out.println(studentName);

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@RequestMapping(value = "/students", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteAllStudents() {

	//	Java Business Logic

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
