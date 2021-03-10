package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;


@Data
@Entity
@Table(name="state")
public class StateEntity {
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	private int sid;
	public StateEntity(String name, double population, String language, int noOfDistict) {
		super();
		this.name = name;
		this.population = population;
		this.language = language;
		this.noOfDistict = noOfDistict;
	}
	@Override
	public String toString() {
		return "StateEntity [sid=" + sid + ", name=" + name + ", population=" + population + ", language=" + language
				+ ", noOfDistict=" + noOfDistict + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoOfDistict() {
		return noOfDistict;
	}
	public void setNoOfDistict(int noOfDistict) {
		this.noOfDistict = noOfDistict;
	}
	@Column(name="NAME")
	private String name;
	@Column(name="POPULATION")
	private double population;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="NO_OF_DISTICTS")
	private int noOfDistict;

}
