package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	@Autowired
	private ResumeService resumeService;
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		return resumeService.add(resume);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Resume>> getAll(){
		return resumeService.getAll();
	}
}
