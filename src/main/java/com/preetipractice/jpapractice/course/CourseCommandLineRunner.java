package com.preetipractice.jpapractice.course;

import com.preetipractice.jpapractice.course.Course;
import com.preetipractice.jpapractice.course.jpa.CourseJpaRepository;
import com.preetipractice.jpapractice.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
   private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String...args) throws Exception
    {
repository.save(new Course(1,"Learn AWS springjpa","in28minutes"));
        repository.save(new Course(2,"Learn Azure springjpa","in28minutes"));
        repository.save(new Course(3,"Learn devops springjpa","in28minutes"));

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());

    }
}
