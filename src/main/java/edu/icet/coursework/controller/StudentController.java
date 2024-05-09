package edu.icet.coursework.controller;

import edu.icet.coursework.model.Student;
import edu.icet.coursework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/student")
    public Student persist(@RequestBody Student student){
        return service.persist(student);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @GetMapping("/student")
    public Student searchStudent(@RequestParam(name = "studNo") String studNo){
       return service.searchStudent(studNo);
    }

    @GetMapping("/all-students")
    public List<Student> retrieveAllStudents(){
        return service.retrieveAllStudents();
    }

    @DeleteMapping("/student")
    public void removeStudent(@RequestParam(name = "studNo") String studNo){
        service.removeStudent(studNo);
    }
}
