package com.aplikasi.backend.AplikasiBackend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aplikasi.backend.AplikasiBackend.model.Siswa;

@Mapper
public interface SiswaDao {
	public List<Siswa> getAllSiswa();
	public void saveSiswa(Siswa siswa);
	public void deleteSiswa(String id);
	public Siswa findSiswa(String id);
}
