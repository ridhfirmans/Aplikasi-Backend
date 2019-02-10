package com.aplikasi.backend.AplikasiBackend.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.backend.AplikasiBackend.model.Kelas;
import com.aplikasi.backend.AplikasiBackend.service.KelasService;

@RestController
@RequestMapping("/api")
public class KelasController {

	@Autowired
	KelasService klsService;
	
	@GetMapping("/kelas")
	@ResponseBody
	public List<Kelas> getAllKelas(){
		return klsService.getAllKelas();
	}
}
