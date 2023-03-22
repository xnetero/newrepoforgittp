package com.d2jjj.demo.repositories;

import com.d2jjj.demo.entities.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentReposityImpl implements  StudentRepository{


    //    private final static Logger LOGGER= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    public StudentReposityImpl() {
    }

    @Override
    public Long save(StudentEntity s) {
        return null;
    }

    @Override
    public Long update(StudentEntity s) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public List<StudentEntity> selectAll() {
        return null;
    }
}
