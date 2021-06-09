package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.dtos.EducationDto;

@Service
public class EducationManager implements EducationService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private EducationDao educationDao;

	@Override
	public Result add(EducationDto educationDto) {

		educationDao.save(dtoConverter(educationDto));
		return new SuccessResult("education added");
	}

	@Override
	public DataResult<List<EducationDto>> getAll() {
		return new SuccessDataResult<List<EducationDto>>(dtoConverter(educationDao.findAll()), "education listed");
	}
	
	
	
	public List<EducationDto> dtoConverter(List<Education> educations){
		List<EducationDto> jPDtos=new ArrayList<EducationDto>();
		educations.forEach(x->{
			EducationDto dto=modelMapper.map(x, EducationDto.class);
			jPDtos.add(dto);
		});
		
		return jPDtos;
	}
	
	public Education dtoConverter(EducationDto educationDto){
		
		Education education=modelMapper.map(educationDto, Education.class);
			
     		return education;
	}
}
