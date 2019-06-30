package com.aplikasi.backend.AplikasiBackend.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.backend.AplikasiBackend.model.Siswa;
import com.aplikasi.backend.AplikasiBackend.service.SiswaService;

@RestController
@RequestMapping("/api")
public class SiswaApiController {
	
	@Autowired
	SiswaService siswaService asdadadadasda;
	
	@GetMapping("/siswa")
	@ResponseBody
	public List<Siswa> getAllSiswa(){
		return siswaService.getAllSiswa();
	}
	
	@DeleteMapping("/siswa/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") String id){
		siswaService.deleteSiswa(id);
	}
	
	@PostMapping("/siswa")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveSiswa(@RequestBody @Valid Siswa siswa){
		siswaService.saveSiswa(siswa);
	}
	
	
	@GetMapping("/siswa/{id}")
	@ResponseBody
	public Siswa findSiswa(@PathVariable("id") String id){
		Siswa siswa = siswaService.findSiswa(id);
		return siswa;
	}
	
	@PutMapping("/siswa/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") String id,
    		@RequestBody @Valid Siswa siswa){
		
		/*Siswa siswaFromDb = siswaService.findSiswa(id);
		if(siswaFromDb == null)
			return;
		else
			siswaService.deleteSiswa(id);
		
		BeanUtils.copyProperties(siswa, siswaFromDb);
		siswaFromDb.setId(id);*/
		siswaService.updateSiswa(siswa);
	
	}

}
