package com.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Courses;
import com.rest.service.CourseService;

@RestController
public class Mycontroller {
	@Autowired
	private CourseService service;
	
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.service.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("courses")
	public Courses addCourses(@RequestBody Courses course)
	{
		return this.service.addCourses(course);
	}
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course)
	{
		return this.service.updateCourses(course);
	}

	
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId)
	{
		try {
			this.service.deleteCourses(Long.parseLong(courseId));
			return new  ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new  ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
