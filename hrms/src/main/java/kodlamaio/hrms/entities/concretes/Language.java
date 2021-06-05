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
@Table(name = "resume_langs")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "resume_id")	
	private Resume resume;
	
	@NotBlank(message = "cold not be empty")
	@Column(name = "language")	
	private String language;
	
	@Column(name = "lang_level")
	@NotBlank(message = "cold not be empty")
	private char langLevel;
	
	@Column(name = "created_date")	
	private LocalDate createdDate;
}
