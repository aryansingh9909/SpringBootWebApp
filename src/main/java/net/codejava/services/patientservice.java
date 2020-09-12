package net.codejava.services;

import net.codejava.Domain.patient;
import java.util.List;


public interface patientservice {
    List<patient> ListAll();
    patient getById(String id);
 
}