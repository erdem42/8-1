package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Graduate;
import kodlamaio.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	@Autowired
	private ResumeDao resumeDao;
	
	@Override
	public Result add(Resume resume) {

		resumeDao.save(resume);
		
		return new SuccessResult("resume added");
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(resumeDao.findAll(),"graduate listed");

	}

}
