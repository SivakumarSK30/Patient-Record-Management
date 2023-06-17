package org.jsp.hospital.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.hibernate.query.Query;
import org.jsp.hospital.dao.PatientDao;
import org.jsp.hospital.dto.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class PatientController {
	@Autowired
	private PatientDao dao;

	@RequestMapping(value = "/register")
	public ModelAndView savePatient(@ModelAttribute Patient patient, ModelAndView view) {
		view.setViewName("msg2.jsp");
		patient = dao.savePatient(patient);
		view.addObject("msg", "New Patient Saved with the ID: " + patient.getId());
		return view;
	}
	@RequestMapping(value = "/update")
	public ModelAndView updatepatient(@ModelAttribute Patient patient, ModelAndView view) {
		view.setViewName("msg2.jsp");
		patient = dao.updatepatient(patient);
		view.addObject("msg", "***Patient details updated***" );
		return view;
	}
	@RequestMapping(value = "/delete")
	public ModelAndView deletePatient(ModelAndView view,@RequestParam int id) {
		boolean isDeleted=dao.deletePatient(id);
		if(isDeleted) {
			view.setViewName("msg2.jsp");
			view.addObject("msg", "Patient Details Deleted Successfully");
			return view;
		}else {
			view.setViewName("msg2.jsp");
			view.addObject("msg", "***Invalid ID***");
			return view;
		}
	}
	@RequestMapping(value = "/view")
	public ModelAndView viewPatient(@ModelAttribute Patient patient,@RequestParam int id, ModelAndView view) {
		patient=dao.viewPatient(id);
		if(patient!=null) {
			view.setViewName("msg2.jsp");
			view.addObject("msg", "Patient ID: "+patient.getId());
			view.addObject("msg2", "Patient Name: "+patient.getName());
			view.addObject("msg3", "Patient Age: "+patient.getAge());
			view.addObject("msg4", "Patient Phone: "+patient.getPhone());
			view.addObject("msg5", "Patient Address: "+patient.getAddress());
			return view;
		}else {
			view.setViewName("msg2.jsp");
			view.addObject("msg", "***Invalid Patient Id***");
			return view;
		}
	}
}
