package com.student.svcet.controller;

import com.student.svcet.entity.Student;
import com.student.svcet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping(value = "/save")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping(value = "/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id")int id){

        return service.getStudentById(id);
    }

    @Cacheable(value = "students")
    @GetMapping("/list")
    public List<Student> list(){

        return service.list();
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id")int id){
        service.deleteStudentById(id);
        return "Deleted Successfully ID is "+id;
    }

}
