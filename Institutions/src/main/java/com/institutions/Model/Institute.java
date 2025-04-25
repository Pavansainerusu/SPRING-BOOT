package com.institutions.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Institute {
		@Id
		long roll;
		String student_name;
		String email;
		long mobile;
		String institute_name;
		String institute_code;
		public long getRoll() {
			return roll;
		}
		public void setRoll(long roll) {
			this.roll = roll;
		}
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public String getInstitute_name() {
			return institute_name;
		}
		public void setInstitute_name(String institute_name) {
			this.institute_name = institute_name;
		}
		public String getInstitute_code() {
			return institute_code;
		}
		public void setInstitute_code(String institute_code) {
			this.institute_code = institute_code;
		}
		@Override
		public String toString() {
			return "Institute [roll=" + roll + ", student_name=" + student_name + ", email=" + email + ", mobile="
					+ mobile + ", institute_name=" + institute_name + ", institute_code=" + institute_code + "]";
		}
		
}
