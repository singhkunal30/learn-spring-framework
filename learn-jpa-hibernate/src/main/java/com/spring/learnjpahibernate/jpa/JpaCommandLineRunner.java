//package com.spring.learnjpahibernate.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.spring.learnjpahibernate.course.Course;
//
//@Component
//public class JpaCommandLineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private JpaRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn AWS", "Kunal"));
//		repository.insert(new Course(2, "Learn DevOps", "Kunal"));
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//	}
//	
//	
//}
