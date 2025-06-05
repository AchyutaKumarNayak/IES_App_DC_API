package in.achyuta.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Education {
	
	private Long caseNum;
	private Integer userId;
	private String highestDegree;
	private Integer gradYear;
	private String universityName;

}
