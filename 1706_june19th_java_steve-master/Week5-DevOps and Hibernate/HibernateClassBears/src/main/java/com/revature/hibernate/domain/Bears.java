package com.revature.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
//@Table(name="BEAR", uniqueConstraints= @UniqueConstraint(columnNames = "HONEYPOT_ID"))
@Table(name="BEAR")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="myAwesomeCache")

public class Bears {
	@Id
	@Column(name="bear_id")
	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="BEARID_SEQ")
	private int bearId;
	
	@Column(name="bear_color")
	private String bearColor;
	
	@Column
	private String breed;
	@Column
	private double height;
	
	@Column
	private double weight;
	

	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="BEAR_HOME")
	private Cave dwelling;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="HONEYPOT_ID",unique=true)
	private HoneyPot honeyPot;
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="PARENT_CUB",
			joinColumns=@JoinColumn(name="PARENT_ID"),
			inverseJoinColumns=@JoinColumn(name="CUB_ID"))
	private Set<Bears> bearCubs;
	
	
	public Bears(){
		super();
		this.bearCubs = new HashSet<Bears>();
	}

	
	//Straight up bear constructor - Roaming Bear
	public Bears(String bearColor, String breed, double height, double weight, HoneyPot honeyPot) {
		this();
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.honeyPot = honeyPot;
	}




	public Bears(int bearId, String bearColor, String breed, double height, double weight, Cave dwelling,
			HoneyPot honeyPot) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.dwelling = dwelling;
		this.honeyPot = honeyPot;
	}
	
	public Bears(int bearId, String bearColor, String breed, double height, double weight, Cave dwelling,
			HoneyPot honeyPot, Set<Bears> bearCubs) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.dwelling = dwelling;
		this.honeyPot = honeyPot;
		this.bearCubs = bearCubs;
	}


	public int getBearId() {
		return bearId;
	}


	public void setBearId(int bearId) {
		this.bearId = bearId;
	}


	public String getBearColor() {
		return bearColor;
	}


	public void setBearColor(String bearColor) {
		this.bearColor = bearColor;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public Cave getDwelling() {
		return dwelling;
	}


	public void setDwelling(Cave dwelling) {
		this.dwelling = dwelling;
	}


	public HoneyPot getHoneyPot() {
		return honeyPot;
	}


	public void setHoneyPot(HoneyPot honeyPot) {
		this.honeyPot = honeyPot;
	}


	public Set<Bears> getBearCubs() {
		return bearCubs;
	}


	public void setBearCubs(Set<Bears> bearCubs) {
		this.bearCubs = bearCubs;
	}


	@Override
	public String toString() {
		return "Bears [bearId=" + bearId + ", bearColor=" + bearColor + ", breed=" + breed + ", height=" + height
				+ ", weight=" + weight + ", dwelling=" + dwelling + ", honeyPot=" + honeyPot + "]";
	}
	

}
	

