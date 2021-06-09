package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResumeDto {

	@JsonIgnore
	private int id;
	
	
	private int candidateId;
	private String githubLink;
	private String linkedLink;
	private String description;
	private String photo;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate updatedDate;
	
	
   	
	
	
	
}
