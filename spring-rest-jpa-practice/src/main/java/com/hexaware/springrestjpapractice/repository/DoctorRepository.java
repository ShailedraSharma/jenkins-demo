package com.hexaware.springrestjpapractice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpapractice.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{
	
	List<Doctor> findByDoctorName(String name);
	List<Doctor> findDoctorByExperienceGreaterThan(int experience);
	
	@Query("select d from Doctor d where d.experience between :min and :max")
	List<Doctor> findDoctorByExperienceRange(int min, int max);
	
	@Modifying
	@Query("delete from Doctor d where d.doctorName = :name")
	int deletByDoctorName(String name);
}
