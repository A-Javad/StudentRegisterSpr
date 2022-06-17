package orient.com.StudentRegisterSpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public String students(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "student";
    }
    @GetMapping("/create")
    public String create(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
        return "redirect:/students";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        Student student = studentRepository.findById(id).get();
        model.addAttribute("student", student);
        return "edit";
    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable("id")long id,Student student,Model model){
        studentRepository.save(student);
        return "redirect:/students";
    }

}
