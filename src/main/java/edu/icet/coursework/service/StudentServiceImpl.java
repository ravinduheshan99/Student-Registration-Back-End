package edu.icet.coursework.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.coursework.entity.StudentEntity;
import edu.icet.coursework.model.Student;
import edu.icet.coursework.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Autowired
    ObjectMapper mapper;

    public Student persist(Student student) {
        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);
        repository.save(entity);
        return mapper.convertValue(entity, Student.class);
    }

    public Student updateStudent(Student student) {
        removeStudent(student.getStudNo());
        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);
        repository.save(entity);
        return mapper.convertValue(entity, Student.class);
    }

    public Student searchStudent(String studNo) {
        Optional<StudentEntity> stud = repository.findById(studNo);
        StudentEntity entity = stud.get();
        return mapper.convertValue(entity, Student.class);
    }

    public List<Student> retrieveAllStudents() {
        Iterable<StudentEntity> allStudents = repository.findAll();
        List<Student> studentList = new ArrayList<>();
        allStudents.forEach(studentEntity -> {
            Student stud = mapper.convertValue(studentEntity, Student.class);
            studentList.add(stud);
        });
        return studentList;
    }

    public void removeStudent(String studNo) {
        Optional<StudentEntity> stud = repository.findById(studNo);
        repository.delete(stud.get());
    }
}
