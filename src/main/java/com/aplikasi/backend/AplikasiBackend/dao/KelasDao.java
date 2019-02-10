package com.aplikasi.backend.AplikasiBackend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aplikasi.backend.AplikasiBackend.model.Kelas;

@Mapper
public interface KelasDao {
	public List<Kelas> getAllKelas();
}
