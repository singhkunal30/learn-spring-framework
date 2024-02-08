//package com.spring.learnjpahibernate.jdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.spring.learnjpahibernate.course.Course;
//
//@Component
//public class JdbcCommandLineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private JdbcRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn AWS", "Kunal"));
//		repository.insert(new Course(2, "Learn JAVA", "Kunal"));
////		repository.delete(2);
//		System.out.println(repository.findById(1));
//	}
//
//}
