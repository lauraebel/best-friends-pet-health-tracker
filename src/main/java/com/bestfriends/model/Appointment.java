package com.bestfriends.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Appointment {
	
	private int appointmentId;
	private int petId;
	private String reasonForAppointment;
	private String procedure;
	private LocalDate dateOfAppointment;
	private BigDecimal costOfAppointment;
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getReasonForAppointment() {
		return reasonForAppointment;
	}
	public void setReasonForAppointment(String reasonForAppointment) {
		this.reasonForAppointment = reasonForAppointment;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public LocalDate getDateOfAppointment() {
		return dateOfAppointment;
	}
	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
	public BigDecimal getCostOfAppointment() {
		return costOfAppointment;
	}
	public void setCostOfAppointment(BigDecimal costOfAppointment) {
		this.costOfAppointment = costOfAppointment;
	}
}
