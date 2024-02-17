package com.student.svcet.service;

import com.student.svcet.StudentNotFoundException;
import com.student.svcet.entity.Student;
import com.student.svcet.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository repository;

    public Student addStudent(Student student){
        Student student1 = repository.save(student);
        log.info("Saved student is {} ", student1);
        return student1;
    }

    public Student updateStudent(Student student){
        Student student1 = repository.save(student);
        log.info("Updated student is {} ", student1);
        return student1;
    }

    public Student getStudentById(int id){

        Optional<Student> student = repository.findById(id);
        log.info("Student By Id is  : {}", student);
        if (student.isPresent()){
            return student.get();
        }else {
            throw new StudentNotFoundException("Student with Id : "+id+" Not Found");
        }
    }

    public List<Student> list(){

        List<Student> list = repository.findAll();
        log.info("List of Students is : {}",list);
        return list;
    }

    public void deleteStudentById(int id){

        repository.deleteById(id);
        log.info("Deleted ID is {}",id);
    }
}
