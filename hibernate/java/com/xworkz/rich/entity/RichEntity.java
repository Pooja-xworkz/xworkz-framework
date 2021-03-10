package com.xworkz.rich.entity;

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
@ToString
@NoArgsConstructor
@Entity
@Table(name = "rich_person")
public class RichEntity {

	public RichEntity() {
		System.out.println("invoked RichEntity");
	}

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COUNTRY")
	private String Country;
	@Column(name = "NET_WORTH_IN_BILLIONS")
	private int netWorthInBillions;
	@Column(name = "BUSINESS")
	private String business;
	@Column(name = "RANK_VALUE")
	private int rank;
	@Column(name = "MARRIED")
	private boolean married;

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

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getNetWorthInBillions() {
		return netWorthInBillions;
	}

	public void setNetWorthInBillions(int netWorthInBillions) {
		this.netWorthInBillions = netWorthInBillions;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "RichEntity [id=" + id + ", name=" + name + ", Country=" + Country + ", netWorthInBillions="
				+ netWorthInBillions + ", business=" + business + ", rank=" + rank + ", married=" + married + "]";
	}

}
