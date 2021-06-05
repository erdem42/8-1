package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.GraduateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.GraduateDao;
import kodlamaio.hrms.entities.concretes.Graduate;

@Service
public class GraduateManager implements GraduateService{

	@Autowired
	private GraduateDao graduateDao;
	
	@Override
	public Result add(Graduate graduate) {
if(graduateDao.existsByDescription(graduate.getDescription())) {
	return new ErrorResult("graduate allready exists");
}
graduateDao.save(graduate);
return new SuccessResult("graduate added");
	}

	@Override
	public DataResult<List<Graduate>> getAll() {
		return new SuccessDataResult<List<Graduate>>(graduateDao.findAll(),"graduate listed");
	}

}
