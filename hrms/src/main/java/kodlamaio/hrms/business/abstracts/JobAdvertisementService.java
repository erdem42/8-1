package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {

	
	//dto
		/*
	DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithEmployerJobTitleDetails(boolean active);
	DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithEmployerJobTitleDetailsOrderByDate(boolean active);

	DataResult<List<JobAdvertisement>> getAllByActiveTrueOrderByReleaseDate();
	DataResult<List<JobAdvertisement>> getAllByActiveTrueAndEmployer_Id(int id);
	Result updateJobAdvertisementIsActive(int jobAdvertisementId,boolean isActive);
	*/
	
	//mapper
	//Result add(JobAdvertisementDto jobAdvertisementDto);
	Result add(JobAdvertisementDto jobAdvertisementDto);
	DataResult<List<JobAdvertisement>> getAllByActiveTrue();
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisementDto>> findByIsActive();
	DataResult<List<JobAdvertisementDto>> findByIsActiveOrderByDeadline();
	DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName);


	
}
