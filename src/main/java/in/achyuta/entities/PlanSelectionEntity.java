package in.achyuta.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DC_PLAN_SELECTION")
@Getter
@Setter
@NoArgsConstructor
public class PlanSelectionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long caseNum;
	
	private Integer planId;
	
	@JoinColumn(name = "case_num",referencedColumnName = "case_num")
	@OneToOne(fetch = FetchType.LAZY)
	private AppEntity app;
	
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	@ManyToOne
	private UserEntity user;

}
