package com.hexaware.springrestjpapractice.service;

import java.util.List;

import com.hexaware.springrestjpapractice.entity.Doctor;

public interface IDoctorService {
	
	public Doctor addDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public String deleteDoctor(long id);
	public Doctor getDoctorById(long id);
	public List<Doctor> getAllDoctor();
	
	public List<Doctor> findByDoctorName(String name);
	public List<Doctor> findDoctorByExperienceGreaterThan(int experience);
	
	public List<Doctor> getDoctorSortedByExperience();
	
	public List<Doctor> findDoctorByExperienceRange(int min, int max);
	
	public int deletByDoctorName(String name);

}
