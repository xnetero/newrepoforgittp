package com.d2jjj.demo.services;

import com.d2jjj.demo.dtos.StudentDTO;
import com.d2jjj.demo.mappers.StudentMapper;
import com.d2jjj.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    //    private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Long save(StudentDTO s) {
//        LOGGER.debug("start method save");
        return studentRepository.save(studentMapper.studentDtoToEntity(s));
    }

    @Override
    public Long update(StudentDTO s) {
//        LOGGER.debug("start method update");
        return studentRepository.update(studentMapper.studentDtoToEntity(s));

    }

    @Override
    public Boolean delete(Long id) {
//        LOGGER.debug("start method delete");
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDTO> selectAll() {
//        LOGGER.debug("start method select All");
        return studentMapper.studentEntiesToDtos(studentRepository.selectAll());
    }
}
