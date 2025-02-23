package com.example.Course.Registeration.System.Controller;

import com.example.Course.Registeration.System.Model.Course;
import com.example.Course.Registeration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.Course.Registeration.System.Model.CourseRegistry;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName
                               ){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! "+name+" Enrollment Successful for "+courseName;
    }
}
