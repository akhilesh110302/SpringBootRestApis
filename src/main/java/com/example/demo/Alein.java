package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alein {
	@Override
	public String toString() {
		return "Alein [ano=" + ano + ", aname=" + aname + "]";
	}
	@Id
	private int ano;
	private String aname;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

}
