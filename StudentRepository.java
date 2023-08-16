package com.website.lms.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.website.lms.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
