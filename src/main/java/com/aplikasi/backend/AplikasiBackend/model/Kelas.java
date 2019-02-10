package com.aplikasi.backend.AplikasiBackend.model;

import javax.persistence.Table;

@Table(name="kelas")
public class Kelas {

	private String id;
	private String kelas;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	
}
