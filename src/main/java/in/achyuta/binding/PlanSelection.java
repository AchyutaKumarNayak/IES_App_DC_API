package in.achyuta.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanSelection {
	
	private Long caseNum;
	private String planName;
	private Integer userId;

}
