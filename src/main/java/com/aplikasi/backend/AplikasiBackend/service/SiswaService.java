package com.aplikasi.backend.AplikasiBackend.service;

import java.util.List;

import com.aplikasi.backend.AplikasiBackend.model.Siswa;

public interface SiswaService {
	public List<Siswa> getAllSiswa();
	public void saveSiswa(Siswa siswa);
}
