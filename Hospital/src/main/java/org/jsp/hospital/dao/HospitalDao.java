package org.jsp.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import org.jsp.hospital.dto.Patient;
import org.jsp.hospital.dto.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalDao {
	@Autowired
	public EntityManager manager;

	public Hospital addHospital(Hospital hospital) {
		EntityTransaction t = manager.getTransaction();
		manager.persist(hospital);
		t.begin();
		t.commit();
		return hospital;
	}

	public Hospital verifyAdmin(long adminphone, String adminpassword) {
		String qry = "select a from Hospital a where a.adminphone=?1 and a.adminpassword=?2";
		javax.persistence.Query q = manager.createQuery(qry);
		q.setParameter(1, adminphone);
		q.setParameter(2, adminpassword);
		try {
			return (Hospital) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
