package in.achyuta.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "IES_APPS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long caseNum;
	
	private String fullName;
	
	private String  email;
	
	private String mobileNum;
	
	private String gender;
	
	private LocalDate dob;
	
	private Long ssn;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@OneToOne
	@JoinColumn(name = "plan_selection_id")
	private PlanSelectionEntity planSelection;
	
	@OneToOne
	@JoinColumn(name = "income_id")
	private IncomeEntity income;
	
	@OneToMany
	@JoinColumn(name = "kids_id")
	private List<KidsEntity> kids;

}
