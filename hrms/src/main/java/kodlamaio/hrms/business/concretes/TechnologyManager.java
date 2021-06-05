package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologyDao;
import kodlamaio.hrms.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{

	@Autowired
	private TechnologyDao technologyDao;
	
	
	@Override
	public Result add(Technology technology) {

		technologyDao.save(technology);
return new SuccessResult("technology added");
	}

	@Override
	public DataResult<List<Technology>> getAll() {
		return new SuccessDataResult<List<Technology>>(technologyDao.findAll(),"technology listed");
	}
}
