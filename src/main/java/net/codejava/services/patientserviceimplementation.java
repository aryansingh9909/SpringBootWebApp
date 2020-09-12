package net.codejava.services;

import net.codejava.command.patientform;
import net.codejava.converter.patientformtopatient;
import net.codejava.Domain.patient;
import net.codejava.repository.patientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class patientserviceimplementation implements patientservice {

    private patientrepository patientrepository1;
    private patientformtopatient patientformtopatient1;

    @Autowired
    public patientserviceimplementation(patientrepository patientrepository1, patientformtopatient patientformtopatient1) {
        this.patientrepository1 = patientrepository1;
        this.patientformtopatient1 = patientformtopatient1;
    }


    @Override
    public List<patient> listAll() {
        List<patient> patient1 = new ArrayList<>();
        patientrepository1.findAll().forEach(patient1::add); //fun with Java 8
        return patient1;
    }

    @Override
    public patient getById(String id) {
        return patientrepository1.findById(id).orElse(null);
    }

    
}
