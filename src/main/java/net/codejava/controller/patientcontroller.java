package net.codejava.controller;

import net.codejava.command.patientform;
import net.codejava.converter.patienttopatientform;
import net.codejava.Domain.patient;
import net.codejava.services.patientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class patientcontroller {
    private patientservice patientservice1;

    private patienttopatientform patienttopatientform1;

    @Autowired
    public void setpatienttopatientform(patienttopatientform patienttopatientform1) {
        this.patienttopatientform1 = patienttopatientform1;
    }

    @Autowired
    public void setpatientservice(patientservice patientservice1) {
        this.patientservice1 = patientservice1;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/patient/searchlist";
    }

    

    @RequestMapping("/patient/search/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("patient", patientservice1.getById(id));
        return "patient/search";
    }

    
    @RequestMapping("/patientform")
    public String newProduct(Model model){
        model.addAttribute("patientform1", new patientform());
        return "patientform";
    }

    
}
