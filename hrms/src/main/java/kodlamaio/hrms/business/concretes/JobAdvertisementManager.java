package kodlamaio.hrms.business.concretes;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	@Autowired
	private JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	private DtoConverterService dtoConverterService;
	/*
	@Override
	public Result add(JobAdvertisementDto jobAdvertisementDto) {
		jobAdvertisementDao.save(dtoConverter(jobAdvertisementDto));
		return new SuccessResult("job advertisement added");

	}
*/
	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("job advertisement deleted");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActive() {
		
		return new SuccessDataResult<List<JobAdvertisementDto>>(dtoConverterService.dtoConverter(jobAdvertisementDao.findByIsActive(true),JobAdvertisementDto.class),"data listed");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActiveOrderByDeadline() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobAdvertisementDto jobAdvertisementDto) {
		jobAdvertisementDao.save((JobAdvertisement) dtoConverterService.dtoClassConverter(jobAdvertisementDto,JobAdvertisement.class));
		return new SuccessResult("job advertisement added");
	}
	
	/*
	public List<JobAdvertisementDto> dtoConverter(List<JobAdvertisement> jobAdvertisements){
		List<JobAdvertisementDto> jPDtos=new ArrayList<JobAdvertisementDto>();
		jobAdvertisements.forEach(x->{
			JobAdvertisementDto dto=modelMapper.map(x, JobAdvertisementDto.class);
			//dto.setEmployerCompanyName(x.getEmployer().getCompanyName());   //manuel setlemek için.
			jPDtos.add(dto);
		});
		
		return jPDtos;
	}
	
	public JobAdvertisement dtoConverter(JobAdvertisementDto jobAdvertisemenDto){
		
			JobAdvertisement jobAdvertisement=modelMapper.map(jobAdvertisemenDto, JobAdvertisement.class);
			
     		return jobAdvertisement;
	}

	*/
	
	
	
	
	
	
	
	

	

	
/*
 @Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);

		return new SuccessResult("jobAdvertisement added");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrueOrderByReleaseDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrueOrderByReleaseDateDesc());

	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrueAndEmployer_Id(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrueAndEmployer_Id(id));

	}

	@Override
	public Result updateJobAdvertisementIsActive(int jobAdvertisementId, boolean isActive) {
		jobAdvertisementDao.findById(jobAdvertisementId).get().setActive(isActive);
		
		jobAdvertisementDao.save(jobAdvertisementDao.findById(jobAdvertisementId).get());

		return new SuccessResult("jobAdvertisement isActive updated");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithEmployerJobTitleDetails(boolean active) {
		return new SuccessDataResult<List<JobAdvertisementDto>>(jobAdvertisementDao.getJobAdvertisementWithEmployerJobTitleDetails(active));

	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithEmployerJobTitleDetailsOrderByDate(boolean active){
			return new SuccessDataResult<List<JobAdvertisementDto>>(jobAdvertisementDao.getJobAdvertisementWithEmployerJobTitleDetailsOrderByDate(active));

	}
*/
}
