package com.bw.bean;

import java.io.Serializable;

public class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer aid;
	private String aname;
	private String weight;
	
	private Integer rid;
	private String rname;
	
	private String rnames;

	public Animal() {
		super();
	}

	public Animal(Integer aid, String aname, String weight, Integer rid, String rname, String rnames) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.weight = weight;
		this.rid = rid;
		this.rname = rname;
		this.rnames = rnames;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRnames() {
		return rnames;
	}

	public void setRnames(String rnames) {
		this.rnames = rnames;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Animal [aid=" + aid + ", aname=" + aname + ", weight=" + weight + ", rid=" + rid + ", rname=" + rname
				+ ", rnames=" + rnames + "]";
	}
	
	
	
}
