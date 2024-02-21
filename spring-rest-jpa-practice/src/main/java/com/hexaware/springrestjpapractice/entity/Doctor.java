package com.hexaware.springrestjpapractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "doctor_info")
public class Doctor {
	
	@Id
	@Min(100)
	@Max(200)
	private long doctorId;
	
	@Pattern(regexp = "^[A-Z]...")
	private String doctorName;
	
	private String speciality;
	
	@Pattern(regexp = "[0-9]{2}")
	private int experience;
	
	public Doctor() {
		super();
	}

	public Doctor(int doctorId, String doctorName, String speciality, int experience) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.experience = experience;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", speciality=" + speciality
				+ ", experience=" + experience + "]";
	}
}
