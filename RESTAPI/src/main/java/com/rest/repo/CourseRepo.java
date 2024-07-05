package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses ,Long>  {

}
