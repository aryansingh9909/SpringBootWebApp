package net.codejava.repository;

import net.codejava.Domain.patient;
import org.springframework.data.repository.CrudRepository;

public interface patientrepository extends CrudRepository<patient, String> {
}