package net.codejava.controller;

import net.codejava.command.patientform;
//import net.codejava.converter.patienttopatientform;
//import net.codejava.Domain.patient;
//import net.codejava.services.patientservice;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

//import javax.validation.Valid;

/**
 * Created by jt on 1/10/17.
 */
@Controller
public class patientcontroller {
  //  private patientservice patientservice1;

    //private patienttopatientform patienttopatientform1;

    //@Autowired
    //public void setpatienttopatientform(patienttopatientform patienttopatientform1) {
        //this.patienttopatientform1 = patienttopatientform1;
    //}

    //@Autowired
    //public void setProductService(patientservice patientservice1) {
      //  this.patientservice1 = patientservice1;
    //}

    @GetMapping(path="/")
    public String redirToList(){
        return "/static/index";
    }

    //@RequestMapping({"/static/searchlist", "/static"})
    //public String listpatient(Model model){
      //  model.addAttribute("patient", patientservice1.ListAll());
       // return "static/searchlist";
    //}

    //@RequestMapping("/static/search{id}")
    //public String getProduct(@PathVariable String id, Model model){
      //  model.addAttribute("patient", patientservice1.getById(id));
       // return "static/searchlist";
   // }


    @RequestMapping("/static/index")
    public String newProduct(Model model){
        model.addAttribute("patientform", new patientform());
        return "static/index";
    }

    

    
}