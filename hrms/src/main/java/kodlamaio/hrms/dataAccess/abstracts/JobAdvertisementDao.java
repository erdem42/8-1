package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerJobTitleDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
//dto
	/*
	List<JobAdvertisement> findAllByIsActiveTrue();     //all columns
	
	@Query("select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerJobTitleDto(a.jobAdvertisementId,e.companyName,t.title,a.positionAmount,a.releaseDate,a.deadline) from JobAdvertisement a join a.employer e join a.jobTitle t where a.isActive=:active")
	List<JobAdvertisementWithEmployerJobTitleDto> getJobAdvertisementWithEmployerJobTitleDetails(boolean active);
	
	@Query("select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerJobTitleDto(a.jobAdvertisementId,e.companyName,t.title,a.positionAmount,a.releaseDate,a.deadline) from JobAdvertisement a join a.employer e join a.jobTitle t where a.isActive=:active order by a.releaseDate")
	List<JobAdvertisementWithEmployerJobTitleDto> getJobAdvertisementWithEmployerJobTitleDetailsOrderByDate(boolean active);
	
	List<JobAdvertisement> findAllByIsActiveTrueOrderByReleaseDateDesc();
	
	@Query("select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerJobTitleDto(a.jobAdvertisementId,e.companyName,t.title,a.positionAmount,a.releaseDate,a.deadline) from JobAdvertisement a join a.employer e join a.jobTitle t where a.isActive=:active and e.id=:id")
	List<JobAdvertisement> findAllByIsActiveTrueAndEmployer_Id(int id);
	*/
	
	List<JobAdvertisement> findByIsActive(boolean isActive);
	List<JobAdvertisement> findByIsActiveOrderByDeadline(boolean isActive);
	List<JobAdvertisement> findByIsActiveAndEmployer_CompanyName(boolean isActive,String companyName);


}
