package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.GraduateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Graduate;

@RestController
@RequestMapping("/api/graduates")
public class GraduatesController {

	@Autowired
	private GraduateService graduateService;


	@GetMapping("/getAll")
	public DataResult<List<Graduate>> getAll(){
		return graduateService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Graduate graduate) {
		return graduateService.add(graduate);
	}

}
