package com.wcs.ColchysreturnBack.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MemberDto {
	
	@NotNull
	@Size(min = 3,max = 100)
	private String govFirstname;
	
	@NotNull
	@Size(min = 3,max = 100)
	private String govLastname;
	
	@NotNull
	@Size(min = 3,max = 100)
	private String role;
	
	@NotNull
	@Size(min = 3,max = 100)
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

	@Override
	public String toString() {
		return "MemberDto [govFirstname=" + govFirstname + ", govLastname=" + govLastname + ", role=" + role
				+ ", ministry=" + ministry + "]";
	}
	
	

}
