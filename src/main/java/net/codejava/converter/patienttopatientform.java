package net.codejava.converter;

import net.codejava.command.patientform;
import net.codejava.Domain.patient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class patienttopatientform implements Converter<patient, patientform> {
    @Override
    public patientform convert(patient patient1) {
        patientform patientform1 = new patientform();
        patientform1.setId(patient1.get_id().toHexString());
        patientform1.setFirstname(patient1.getFirstname());
        patientform1.setLastname(patient1.getLastname());
        patientform1.setGender(patient1.getGender());
        patientform1.setBirthyear(patient1.getBirthyear());
        return patientform1;
    }
}
