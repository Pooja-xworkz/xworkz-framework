package com.xworkz.bbc.bbcEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BB_CONTESTANTS")
public class BbcEntity {
	public BbcEntity() {
		System.out.println("invoked BbcEntity");
	}

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "TYPE_OF_CONTESTANT")
	private String typeofcontenstant;
	@Column(name = "NO_OF_TASK")
	private int nooftasks;
	@Column(name = "NO_DAYS_IN")
	private int noofdays;
	@Column(name = "SEASON")
	private int season;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTypeofcontenstant() {
		return typeofcontenstant;
	}

	public void setTypeofcontenstant(String typeofcontenstant) {
		this.typeofcontenstant = typeofcontenstant;
	}

	public int getNooftasks() {
		return nooftasks;
	}

	public void setNooftasks(int nooftasks) {
		this.nooftasks = nooftasks;
	}

	public int getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "BbcEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", typeofcontenstant="
				+ typeofcontenstant + ", nooftasks=" + nooftasks + ", noofdays=" + noofdays + ", season=" + season
				+ "]";
	}

}
