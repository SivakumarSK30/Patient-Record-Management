package org.jsp.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import org.jsp.hospital.dto.Hospital;
import org.jsp.hospital.dto.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDao {

	@Autowired
	public EntityManager manager;

	public Patient savePatient(Patient patient) {
		EntityTransaction t = manager.getTransaction();
		manager.persist(patient);
		t.begin();
		t.commit();
		return patient;
	}

	public Patient updatepatient(Patient patient) {
		EntityTransaction t = manager.getTransaction();
		manager.merge(patient);
		t.begin();
		t.commit();
		return patient;
	}

	public Patient viewPatient(int id) {
		return manager.find(Patient.class, id);
	}
	public boolean deletePatient( int id) {
		EntityTransaction t=manager.getTransaction();
		Patient p=manager.find(Patient.class, id);
		if(p!=null) {
			manager.remove(p);
			t.begin();
			t.commit();
			return true;
		}else {
			return false;
		}
	}
}
