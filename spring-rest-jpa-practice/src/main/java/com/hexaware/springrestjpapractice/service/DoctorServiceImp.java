package com.hexaware.springrestjpapractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpapractice.entity.Doctor;
import com.hexaware.springrestjpapractice.repository.DoctorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DoctorServiceImp implements IDoctorService {

	@Autowired
	DoctorRepository repo;
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
		return repo.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return repo.save(doctor);
	}

	@Override
	public String deleteDoctor(long id) {
		repo.deleteById(id);
		if(!repo.existsById(id)) {
			return "record deleted";
		}else {
			return "Error occured";
		}
	}

	@Override
	public Doctor getDoctorById(long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return repo.findAll();
	}

	@Override
	public List<Doctor> findByDoctorName(String name) {
		return repo.findByDoctorName(name);
	}

	@Override
	public List<Doctor> findDoctorByExperienceGreaterThan(int experience) {
		return repo.findDoctorByExperienceGreaterThan(experience);
	}

	@Override
	public List<Doctor> getDoctorSortedByExperience() {
		return repo.findAll(Sort.by("experience"));
	}

	@Override
	public List<Doctor> findDoctorByExperienceRange(int min, int max) {
		return repo.findDoctorByExperienceRange(min, max);
	}

	@Override
	public int deletByDoctorName(String name) {
		return repo.deletByDoctorName(name);
	}
	
	

}
