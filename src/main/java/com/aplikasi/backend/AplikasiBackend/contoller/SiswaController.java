package com.aplikasi.backend.AplikasiBackend.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.backend.AplikasiBackend.model.Siswa;
import com.aplikasi.backend.AplikasiBackend.service.SiswaService;

@RestController
@RequestMapping("/api")
public class SiswaController {
	
	@Autowired
	SiswaService siswaService;
	
	@GetMapping("/siswa")
	@ResponseBody
	public List<Siswa> getAllSiswa(){
		return siswaService.getAllSiswa();
	}
	
	@PostMapping("/siswa")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveSiswa(@RequestBody @Valid Siswa siswa){
		siswaService.saveSiswa(siswa);
	}

}
