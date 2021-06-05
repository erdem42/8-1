package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id",referencedColumnName = "id")	
	private Candidate candidate;
	
	@Column(name = "github_link")	
	private String githubLink;
	
	@Column(name = "linked_link")	
	private String linkedLink;
	
	@Column(name = "photo")	
	private String photo;
	
	@Column(name = "description")	
	private String description;
	
	@Column(name = "created_date")	
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate createdDate;
	
	@JsonIgnore
	@Column(name = "update_date")	
	private LocalDate updatedDate;
	
	@JsonIgnore
	@Column(name = "is_active")	
	private boolean isActive=true;

	@JsonIgnore
    @OneToMany(mappedBy = "resume",cascade = CascadeType.ALL )
    private List<Language> languages;

	
    @OneToMany(mappedBy = "resume")
    private List<Education> educations;
    
	@JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Technology> technologies;
    
	@JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<JobExperience> jobExperiences;
	
	
	
	
	
	
	
	
}
