package com.medico.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Extended details of a patient, including address, contact, and emergency contact information.")
public class ExtendedPatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the extended patient details record.", example = "1")
    private Long id;

    @Schema(description = "Residential address of the patient.", example = "123 Main St, Springfield, IL")
    private String address;

    @Schema(description = "Contact number of the patient.", example = "+1-234-567-890")
    private String contactNumber;

    @Schema(description = "Emergency contact information for the patient.", example = "Jane Doe: +1-234-567-891")
    private String emergencyContact;

    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    @Schema(description = "The patient to whom these extended details belong.")
    private Patient patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "ExtendedPatientDetails [id=" + id + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", emergencyContact=" + emergencyContact + ", patient=" + patient + "]";
	}

    // The manual getters and setters can be removed as Lombok already generates them.
    
}
