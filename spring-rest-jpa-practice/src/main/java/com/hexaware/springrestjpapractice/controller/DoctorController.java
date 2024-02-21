package com.hexaware.springrestjpapractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.springrestjpapractice.entity.Doctor;
import com.hexaware.springrestjpapractice.service.IDoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	@Autowired
	IDoctorService service;
	
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return service.addDoctor(doctor);
	}
	
	@PostMapping("/update")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return service.updateDoctor(doctor);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable long id) {
		return service.deleteDoctor(id);
	}
	
	@GetMapping("/get/{id}")
	public Doctor getDoctorById(@PathVariable long id) {
		return service.getDoctorById(id);
	}
	
	@GetMapping("/getall")
	public List<Doctor> getAllDoctor() {
		return service.getAllDoctor();
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Doctor> getDocotorByName(@PathVariable String name) {
		return service.findByDoctorName(name);
	}
	
	@GetMapping("/getbyexperiencegt/{experience}")
	public List<Doctor> getDocotorByExperienceGt(@PathVariable int experience) {
		return service.findDoctorByExperienceGreaterThan(experience);
	}
	
	@GetMapping("/getsortedbyexperience")
	public List<Doctor> getDoctorSortedByExperience() {
		return service.getDoctorSortedByExperience();
	}
	
	@GetMapping("/getdoctorbyexperiencerange/{min}/{max}")
	public List<Doctor> getDoctorByExperienceRange(@PathVariable int min,@PathVariable int max){
		return service.findDoctorByExperienceRange(min, max);
	}
	
	@DeleteMapping("/deletebydoctorname/{name}")
	public String deleteByDoctorName(@PathVariable String name) {
		return service.deletByDoctorName(name) + " record deleted";
	}
	
	
}
