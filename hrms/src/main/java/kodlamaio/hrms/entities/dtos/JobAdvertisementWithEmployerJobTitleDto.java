package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithEmployerJobTitleDto {
//dto
	/*
	private int id;
	private String companyName;
	private String jobTitle;
	private int positionAmount;
	private LocalDate releaseDate;
	private LocalDate deadline;
*/
	private String employerCompanyName;
	private String description;
	private String jobTitleTitle;
	private int positionAmount;
	private LocalDate releaseDate;
	private LocalDate deadline;
	
	
}
