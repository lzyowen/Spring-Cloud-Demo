package com.student2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController
{
    @GetMapping("/name")
    public String getControllerName()
    {
        return "StudentController - www.SpringBootDev.com - Service-2";
    }

    @GetMapping("/students/{student_id}")
    public Student getStudentById(@PathVariable("student_id") Integer studentId)
    {
       	System.out.println("+++++++++++Service-2/students/{student_id} is invoked ++++++++++++++"+LocalTime.now());
        return new Student(1, "Chathuranga-2", "Bsc", "Sri Lanka");
    }


    @GetMapping("/courses/{course_id}/students")
    public List<Student> getStudentsByCourses(@PathVariable("course_id") Integer courseId)
    {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga-2", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana-2", "Sun Certified", "Sri Lanka"));
        return studentList;
    }


    @GetMapping("/departments/{department_id}/courses/{course_id}/students")
    public List<Student> getStudentsByDepartmentCourses(
            @PathVariable("department_id") Integer departmentId,
            @PathVariable("course_id") Integer courseId) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga-2", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana-2", "Sun Certified", "Sri Lanka"));
        studentList.add(new Student(3, "Tennakoon-2", "Zend Certified", "Sri Lanka"));
        return studentList;
    }
}
