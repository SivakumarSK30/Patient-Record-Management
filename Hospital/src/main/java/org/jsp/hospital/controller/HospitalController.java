package org.jsp.hospital.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jsp.hospital.dao.HospitalDao;
import org.jsp.hospital.dto.Patient;
import org.jsp.hospital.dto.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalController {
	@Autowired
	private HospitalDao dao;


	@RequestMapping(value = "/adminregister")
	public ModelAndView addHospital(@ModelAttribute Hospital hospital, ModelAndView view) {
		view.setViewName("msg.jsp");
		hospital = dao.addHospital(hospital);
		view.addObject("msg", "Admin Registration successful with the ID: " + hospital.getId());
		return view;
	}
	
	@PostMapping(value = "/adminlogin")
	public ModelAndView verifyByEmail(@RequestParam long adminphone, @RequestParam String adminpassword) {
		Hospital admin = dao.verifyAdmin(adminphone, adminpassword);
		ModelAndView view = new ModelAndView();
		if (admin != null) {
			view.setViewName("adminhome.jsp");
			return view;
		} else {
			view.addObject("msg", "Invalid Phone Or Password");
			view.setViewName("home.jsp");
			return view;
		}
	}

}
