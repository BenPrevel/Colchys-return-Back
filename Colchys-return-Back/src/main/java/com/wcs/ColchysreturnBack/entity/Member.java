package com.wcs.ColchysreturnBack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2,max = 100)
	private String govFirstname;
	
	@NotNull
	@Size(min = 2,max = 100)
	private String govLastname;
	
	@NotNull
	@Size(min = 2,max = 100)
	private String role;
	
	@NotNull
	@Size(min = 2,max = 100)
	private String ministry;
	
	public String getGovFirstname() {
		return govFirstname;
	}

	public void setGovFirstname(String govFirstname) {
		this.govFirstname = govFirstname;
	}

	public String getGovLastname() {
		return govLastname;
	}

	public void setGovLastname(String govLastname) {
		this.govLastname = govLastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMinistry() {
		return ministry;
	}

	public void setMinistry(String ministry) {
		this.ministry = ministry;
	}

	
	
}
