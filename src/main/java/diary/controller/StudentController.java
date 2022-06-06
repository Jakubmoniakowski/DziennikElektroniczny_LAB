package com.kul.films.controllers;

import com.kul.films.service.FilmsService;
import diary.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public String getStudent(Model model){
        model.addAttribute("student", studentService.getAllStudents());
        return "student.html";
    }

    @GetMapping("/student/{filmName}")
    public String getFilmDetails(@PathVariable String student, Model model){
        model.addAttribute("filmDetails", studentService.getAllStudents());
        return "filmDetails.html";
    }
}
