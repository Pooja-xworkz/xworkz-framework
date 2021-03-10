package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@Table(name="waterfalls_management")

public class WaterFallEntity {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "WID")
	private int wid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "HEIGHT")
	private double height;
	@Column(name = "DEPTH")
	private double depth;
	@Column(name = "ELECTRICITY_GENERATED")
	private boolean electricityGenerated;
	@Column(name = "SOURCE_RIVER")
	private String sourceRiver;
	@Column(name = "ENTRY_FEES")
	private int entryFee;
	@Column(name = "DESTINATION")
	private String destination;
	@Column(name = "RATING")
	private double rating;
	@Column(name = "NO_OF_DEATH")
	private int noOfDeath;
	@Column(name = "NO_OF_VISITORS")
	private int noofvisitors;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public boolean isElectricityGenerated() {
		return electricityGenerated;
	}

	public void setElectricityGenerated(boolean electricityGenerated) {
		this.electricityGenerated = electricityGenerated;
	}

	public String getSourceRiver() {
		return sourceRiver;
	}

	public void setSourceRiver(String sourceRiver) {
		this.sourceRiver = sourceRiver;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNoOfDeath() {
		return noOfDeath;
	}

	public void setNoOfDeath(int noOfDeath) {
		this.noOfDeath = noOfDeath;
	}

	public int getNoofvisitors() {
		return noofvisitors;
	}

	public void setNoofvisitors(int noofvisitors) {
		this.noofvisitors = noofvisitors;
	}

	@Override
	public String toString() {
		return "WaterFallEntity [wid=" + wid + ", name=" + name + ", location=" + location + ", height=" + height
				+ ", depth=" + depth + ", electricityGenerated=" + electricityGenerated + ", sourceRiver=" + sourceRiver
				+ ", entryFee=" + entryFee + ", destination=" + destination + ", rating=" + rating + ", noOfDeath="
				+ noOfDeath + ", noofvisitors=" + noofvisitors + "]";
	}

}
