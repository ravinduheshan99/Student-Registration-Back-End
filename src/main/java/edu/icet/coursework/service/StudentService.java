package edu.icet.coursework.service;

import edu.icet.coursework.model.Student;

import java.util.List;

public interface StudentService {
    public Student persist(Student student);
    public Student updateStudent(Student student);
    public Student searchStudent(String studNo);
    public List<Student> retrieveAllStudents();
    public void removeStudent(String studNo);
}
