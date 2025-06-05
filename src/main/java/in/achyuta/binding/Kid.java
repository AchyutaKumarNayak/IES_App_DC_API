package in.achyuta.binding;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kid {
	
	private String kidName;
	private Long kidSsn;
	private LocalDate kidDob;
	

}
