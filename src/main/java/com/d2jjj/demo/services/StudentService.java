package com.d2jjj.demo.services;

import com.d2jjj.demo.dtos.StudentDTO;

import java.util.List;

public interface StudentService {


    Long save(StudentDTO s);

    Long update(StudentDTO s);

    Boolean delete(Long id);

    List<StudentDTO> selectAll();


}
