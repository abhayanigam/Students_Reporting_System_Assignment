package com.studentreporting.controller;

import com.studentreporting.entities.Student;
import com.studentreporting.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.inject.Inject;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Inject
    private StudentService studentService;

    @GetMapping("/viewStudents")
    public String viewStudents(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "view-students";
    }


    @GetMapping("/addStudent")
    public String addStudentView(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/addStudent")
    public RedirectView addStudent(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/student/addStudent", true);
        studentService.createStudent(student);
        Student savedStudent =student;

        redirectAttributes.addFlashAttribute("savedStudent", savedStudent);
        redirectAttributes.addFlashAttribute("addStudentSuccess", true);

        return redirectView;
    }
}
