package edu.icet.coursework.repository;

import edu.icet.coursework.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<StudentEntity,String> {
}
