package com.example.Course.Registeration.System.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity  // class convert to table . thats called ORM
public class Course {
    @Id // primary Key
    private String courseId;
    private String courseName;
    private String Trainer;
    private int durationId;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public int getDurationId() {
        return durationId;
    }

    public void setDurationId(int durationId) {
        this.durationId = durationId;
    }
}
