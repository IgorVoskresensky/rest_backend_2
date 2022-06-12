package ru.ivos.rest_backend_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ivos.rest_backend_2.model.Student;
import ru.ivos.rest_backend_2.repository.StudentRepository;

import java.util.List;

/**
 * @author iVos 12.06.2022
 */

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentRepository.save(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

}
