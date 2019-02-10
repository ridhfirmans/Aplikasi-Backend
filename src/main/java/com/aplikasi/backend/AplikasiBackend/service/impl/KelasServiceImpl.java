package com.aplikasi.backend.AplikasiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplikasi.backend.AplikasiBackend.dao.KelasDao;
import com.aplikasi.backend.AplikasiBackend.model.Kelas;
import com.aplikasi.backend.AplikasiBackend.service.KelasService;

@Component
public class KelasServiceImpl implements KelasService{

	@Autowired
	KelasDao klsDao;
	
	@Override
	public List<Kelas> getAllKelas(){
		List<Kelas> listKelas = klsDao.getAllKelas();
		return listKelas;
	}
}
