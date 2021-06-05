package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resume_edus")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	@JoinColumn(name = "resume_id")	
	private Resume resume;
	
	@Column(name = "school_name")	
	@NotBlank(message = "could not be empty")
	private String schoolName;
	
	
	@ManyToOne()
	@JoinColumn(name ="graduate_id",referencedColumnName = "id")
	private Graduate graduate;
	
	@Column(name = "school_department")	
	@NotBlank(message = "could not be empty")
	private String schoolDepartment;
	
	@Column(name = "started_date")	
	@NotBlank(message = "could not be empty")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate startedDate;
	
	@Column(name = "ended_date")	
	private LocalDate endedDate;
	
	@Column(name = "created_date")	
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate createdDate;

}
