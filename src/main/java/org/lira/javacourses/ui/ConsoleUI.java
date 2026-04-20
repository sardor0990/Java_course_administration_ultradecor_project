package org.lira.javacourses.ui;

import org.lira.javacourses.model.JavaCourse;
import org.lira.javacourses.service.DataService;

import java.util.List;

public class ConsoleUI implements UI {
    private DataService dataService;

    @Override
    public void setDataService(DataService dataService){
        this.dataService = dataService;
    }

    @Override
    public void show(){
        System.out.println("=== Java Course Administration (Console) ===\n");

        List<JavaCourse> courses = dataService.getAllJavaCourses();

        if(courses.isEmpty()){
            System.out.println("No courses found.");
        }else{
            System.out.println("ID\t\t\t\t\t\t\t\t\t\tName\t\t\t\tDuration\tParticipants\tCost\t\tType");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            for (JavaCourse course : courses) {
                System.out.printf(
                        "%-36s %-25s %-10d %-15d %-12.2f %-10s%n",
                        course.getId(),
                        course.getDescription(),
                        course.getDuration(),
                        course.getMaxParticipants(),
                        course.getCostPerParticipant(),
                        course.getCourseType()
                );
            }
        }
    }
}
