package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resume_job_exps")
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "resume_id")	
	private Resume resume;
	
	@Column(name = "company_name")
	@NotBlank(message = "cold not be empty")
	private String companyName;
	
	@ManyToOne
	@JoinColumn(name = "job_title_id",referencedColumnName = "job_title_id")	
	private JobTitle jobTitle;
	
	@Column(name = "started_date")	
	@NotBlank(message = "cold not be empty")
	private LocalDate startedDate;	
	
	@Column(name = "ended_date")	
	private LocalDate endedDate;
	
	@Column(name = "created_date")	
	private LocalDate createdDate;

}
