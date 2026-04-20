package org.lira.javacourses.service;

import org.lira.javacourses.model.CourseType;
import org.lira.javacourses.model.JavaCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataServiceImpl implements DataService{

    @Override
    public List<JavaCourse> getAllJavaCourses() {
        List<JavaCourse> courses = new ArrayList<>();

        JavaCourse course1 = new JavaCourse();
        course1.setId(UUID.randomUUID());
        course1.setDescription("Java for Beginners");
        course1.setDuration(40);
        course1.setMaxParticipants(15);
        course1.setCostPerParticipant(1200.00);
        course1.setCourseType(CourseType.BEGINNER);

        JavaCourse course2 = new JavaCourse();
        course2.setId(UUID.randomUUID());
        course2.setDescription("Advanced Java Patterns");
        course2.setDuration(32);
        course2.setMaxParticipants(12);
        course2.setCostPerParticipant(1500.00);
        course2.setCourseType(CourseType.EXPERIENCED);

        System.out.println("hello");

        JavaCourse course3 = new JavaCourse();
        course3.setId(UUID.randomUUID());
        course3.setDescription("Jakarta EE for Experts");
        course3.setDuration(48);
        course3.setMaxParticipants(10);
        course3.setCostPerParticipant(2000.00);
        course3.setCourseType(CourseType.EXPERT);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        return courses;
    }
}
