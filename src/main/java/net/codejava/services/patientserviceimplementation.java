package net.codejava.services;

//import net.codejava.command.patientform;
import net.codejava.converter.patientformtopatient;
import net.codejava.Domain.patient;
import net.codejava.repository.patientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class patientserviceimplementation implements patientservice {

    private patientrepository patientrepository1;
    //private patientformtopatient patientformtopatient1;

    @Autowired
    public patientserviceimplementation(patientrepository patientrepository1, patientformtopatient patientformtopatient1) {
        this.patientrepository1 = patientrepository1;
        //this.patientformtopatient1 = patientformtopatient1;
    }


    @Override
    public List<patient> ListAll() {
        List<patient> patients = new ArrayList<>();
        patientrepository1.findAll().forEach(patients::add); //fun with Java 8
        return patients;
    }

    @Override
    public patient getById(String id) {
        return patientrepository1.findById(id).orElse(null);
    }

    
}