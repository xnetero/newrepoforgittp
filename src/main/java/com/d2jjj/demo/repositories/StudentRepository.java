package com.d2jjj.demo.repositories;

import com.d2jjj.demo.dtos.StudentDTO;
import com.d2jjj.demo.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {



    Long save(StudentEntity s);
    Long update(StudentEntity s);
    Boolean delete(Long id);
    List<StudentEntity> selectAll();
}
