package net.codejava.converter;


import net.codejava.command.patientform;
import net.codejava.Domain.patient;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class patientformtopatient implements Converter<patientform, patient> {

    @Override
    public patient convert(patientform patientform1) {
        patient patient1 = new patient();
        if (patientform1.getId() != null && !StringUtils.isEmpty(patientform1.getId())) {
            patient1.set_id(new ObjectId(patientform1.getId()));
        }
        patient1.setFirstname(patientform1.getFirstname());
        patient1.setLastname(patientform1.getLastname());
        patient1.setGender(patientform1.getGender());
        patient1.setBirthyear(patientform1.getBirthyear());
        return patient1;
    }
}
