package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;
import kodlamaio.hrms.entities.dtos.ResumeDto;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	@Autowired
	private ResumeService resumeService;
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeDto resumeDto) {
		return resumeService.add(resumeDto);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ResumeDto>> getAll(){
		return resumeService.getAll();
	}
	
	//update yapıldığı için
	@PutMapping("/uploadImage")   
	public Result saveImage(@RequestBody MultipartFile file,@RequestParam int resumeId) {

		return resumeService.saveImage(file, resumeId);
}
}