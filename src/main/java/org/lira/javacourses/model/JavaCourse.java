package org.lira.javacourses.model;

import java.util.Objects;
import java.util.UUID;

public class JavaCourse {
    private UUID id;
    private String description;
    private int duration;
    private int maxParticipants;
    private double costPerParticipant;
    private CourseType courseType;

    public JavaCourse() {
    }

    public JavaCourse(UUID id, String description, int duration, int maxParticipants, double costPerParticipant, CourseType courseType) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.maxParticipants = maxParticipants;
        this.costPerParticipant = costPerParticipant;
        this.courseType = courseType;
    }

    public UUID getId(){
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public double getCostPerParticipant() {
        return costPerParticipant;
    }

    public void setCostPerParticipant(double costPerParticipant) {
        this.costPerParticipant = costPerParticipant;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        JavaCourse that = (JavaCourse) o;
        return duration == that.duration &&
                maxParticipants == that.maxParticipants &&
                Double.compare(that.costPerParticipant, costPerParticipant) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(description, that.description) &&
                courseType == that.courseType;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, description, duration, maxParticipants, costPerParticipant, courseType);
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", maxParticipants=" + maxParticipants +
                ", costPerParticipant=" + costPerParticipant +
                ", courseType=" + courseType +
                '}';
    }
}
