package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.persistence.Access;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
//dto
	/*
	private int id;
	private String companyName;
	private String jobTitle;
	private int positionAmount;
	private LocalDate releaseDate;
	private LocalDate deadline;
*/
	@JsonIgnore
	private int jobAdvertisementId;
	
	private int employerId;
	private int cityId;
	private int jobTitleId;

	private String employerCompanyName;
	private String description;
	private String jobTitleTitle;
	private int positionAmount;
	
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;
	
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate deadline;
	
	
}
