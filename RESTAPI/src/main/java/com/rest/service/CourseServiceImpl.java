package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Courses;
import com.rest.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
 @Autowired
	private CourseRepo courseRepo;

	//List<Courses> list;
	
	
	public CourseServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
//		list= new ArrayList<Courses>();
//		list.add(new Courses(1,"java","language"));
//		list.add(new Courses(2,"python","data"));
//		list.add(new Courses(3,"rubby","analyses"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		
		
		return courseRepo.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Courses c=null;
//		for(Courses course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		return courseRepo.getById(courseId);
	}

	@Override
	public Courses addCourses(Courses course) {
		// TODO Auto-generated method stub
//		list.add(course);
//		return course;
		
		courseRepo.save(course);
		return course;
		
		
	}

	@Override
	public Courses updateCourses(Courses course) {
		// TODO Auto-generated method stub
		courseRepo.save(course);
		return course;
	}

	@Override
	public void deleteCourses(long ParseLong) {
		// TODO Auto-generated method stub
		Courses entity=courseRepo.getOne(ParseLong);
		courseRepo.delete(entity);
		
	}

	
	
	

}
