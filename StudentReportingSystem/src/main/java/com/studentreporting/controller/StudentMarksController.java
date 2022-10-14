package com.studentreporting.controller;

import com.studentreporting.entities.Student;
import com.studentreporting.entities.StudentMarks;
import com.studentreporting.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.inject.Inject;

@Controller
@RequestMapping("/marks")
public class StudentMarksController {

    @Inject
    private StudentService studentService;

    @GetMapping("/viewStudents")
    public String viewStudents(Model model) {

        model.addAttribute("students", studentService.getStudents());
        return "view-students";
    }


    @GetMapping("/addMarks/{studentId}")
    public String addStudentView(Model model, @PathVariable("studentId") Integer studentId) {
        Student s = studentService.getStudent(studentId);
        StudentMarks sm = new StudentMarks();
        sm.setStudentId(s.getId());
        sm.setStudentName(s.getName());
        model.addAttribute("marks", sm);
        return "add-student-marks";
    }

    @PostMapping("/addMarks")
    public RedirectView addStudent(@ModelAttribute("marks") StudentMarks marks, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/addMarks/"+marks.getStudentId(), true);

        studentService.addMarks(marks);

//        redirectAttributes.addFlashAttribute("savedStudent", savedStudent);
//        redirectAttributes.addFlashAttribute("addStudentSuccess", true);

        return redirectView;
    }
}
