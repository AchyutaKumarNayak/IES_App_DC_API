package in.achyuta.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "IES_PLANS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanEntity {
	@Id
	@Column(name = "PLAN_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer planId;
	
	@Column(name = "PLAN_CATEGORY")
    private String planCategory;
	
	@Column(name = "PLAN_NAME")
    private String planName;
	
	@Column(name = "PLAN_START_DATE")
    private LocalDate planStartDate;
	
	@Column(name = "PLAN_END_DATE")
    private LocalDate planEndDate;
	
	@Column(name = "PLAN_STATUS")
    private String activeSw;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private UserEntity user;

}
