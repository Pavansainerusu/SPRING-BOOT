package com.example.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="freelance")
public class DataFile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Id")
private Long id;
private String title;
private double hourlyPay;
private LocalDate postedDate;
private double budget;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getHourlyPay() {
	return hourlyPay;
}
public void setHourlyPay(double hourlyPay) {
	this.hourlyPay = hourlyPay;
}
public LocalDate getPostedDate() {
	return postedDate;
}
public void setPostedDate(LocalDate postedDate) {
	this.postedDate = postedDate;
}
public double getBudget() {
	return budget;
}
public void setBudget(double budget) {
	this.budget = budget;
}
@Override
public String toString() {
	return "DataFile [id=" + id + ", title=" + title + ", hourlyPay=" + hourlyPay + ", postedDate=" + postedDate
			+ ", budget=" + budget + "]";
}

}
