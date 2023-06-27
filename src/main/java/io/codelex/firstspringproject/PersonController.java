package io.codelex.firstspringproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    private List<Person> personList = new ArrayList<>();

    @GetMapping("/person")
    public String createPersonPage(Model model) {
        model.addAttribute("person", new Person());
        return "personForm";
    }

    @PostMapping("/person")
    public String createPerson(@ModelAttribute Person person) {
        personList.add(person);
        return "personCreated";
    }

    @GetMapping("/persons")
    public String viewPersons(Model model) {
        model.addAttribute("persons", personList);
        return "persons";
    }
}
