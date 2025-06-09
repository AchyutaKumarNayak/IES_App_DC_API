package in.achyuta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DC_EDUCATION_TABLE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EducationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer educationId;
	
	private String highestDegree;
	
	private String universityName;
	
	@OneToOne
	@JoinColumn(name = "case_num")
	private AppEntity app;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
}
