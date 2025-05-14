package com.medico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Schema(description = "Patient entity representing medical record information")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the patient", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Full name of the patient", example = "John Doe")
    private String name;

    @Schema(description = "Age of the patient", example = "45")
    private int age;

    @Schema(description = "Gender of the patient", example = "Male")
    private String gender;

    @Schema(description = "Diagnosis or condition of the patient", example = "Hypertension")
    private String diagnosis;

    // You can keep or remove explicit getters/setters if Lombok @Data is used properly.
    // If you're using Lombok, these methods are already auto-generated.
    
    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", diagnosis=" + diagnosis + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
}
