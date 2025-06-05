package in.achyuta.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SummaryScreen {
	
	private Education education;
	private Income income;
	private Kids kids;
	private PlanSelection planSelection;

}
