package com.preetipractice.jpapractice.course.jdbc;

import com.preetipractice.jpapractice.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY=
            """
                    insert into course (id,name,author)
                    values (?,?,?);
                    """;
    private static String SELECT_QUERY=
            """
                    Select * from course
                    where id=?
                    """;
    public void insert(Course course)
    {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());
    }
    public Course findByid(long id)
    { //ResultSet->Bean=>Rowmapper
       return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);

    }
}
