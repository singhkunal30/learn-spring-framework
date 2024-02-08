package com.spring.learnjpahibernate.springdata.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.learnjpahibernate.course.Course;

@Component
public class SpringJpaCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private SpringDataJpa repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "Kunal"));
		repository.save(new Course(2, "Learn DevOps", "Kunal"));
//		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("Kunal"));
	}
	
	
}
