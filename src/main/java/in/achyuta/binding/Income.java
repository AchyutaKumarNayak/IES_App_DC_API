package in.achyuta.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Income {
	
	private Long caseNum;
	private Integer userId;
	private Double salaryIncome;
	private Double rentIncome;
	private Double propertyIncome;
	
	

}
