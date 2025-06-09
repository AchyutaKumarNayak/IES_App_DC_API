package in.achyuta.binding;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kids {
	
	private Long ssn;
	private Long caseNum;
	private Integer userId;
	private List<Kid> allKids;

}
