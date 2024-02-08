package com.spring.learnjpahibernate.springdata.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learnjpahibernate.course.Course;

public interface SpringDataJpa extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);
}
