package com.aplikasi.backend.AplikasiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplikasi.backend.AplikasiBackend.dao.SiswaDao;
import com.aplikasi.backend.AplikasiBackend.model.Siswa;
import com.aplikasi.backend.AplikasiBackend.service.SiswaService;

@Component
public class SiswaServiceImpl implements SiswaService{

	@Autowired
	SiswaDao siswaDao;
	
	@Override
	public List<Siswa> getAllSiswa(){
		List<Siswa> listSiswa = siswaDao.getAllSiswa();
		return listSiswa;
	}
	
	@Override
	public void saveSiswa(Siswa siswa){
		siswaDao.saveSiswa(siswa);
	}
	
	@Override
	public void deleteSiswa(String id){
		siswaDao.deleteSiswa(id);
	}
	
	@Override
	public Siswa findSiswa(String id){
		Siswa siswa = siswaDao.findSiswa(id);
		return siswa;
	}
	
	@Override
	public void updateSiswa(Siswa siswa){
		siswaDao.updateSiswa(siswa);
	}
}
