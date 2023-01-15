package com.preetipractice.jpapractice.course.springdatajpa;

import com.preetipractice.jpapractice.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
}
