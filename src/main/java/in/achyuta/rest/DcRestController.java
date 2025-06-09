package in.achyuta.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.achyuta.binding.Education;
import in.achyuta.binding.Income;
import in.achyuta.binding.Kids;
import in.achyuta.binding.PlanSelection;
import in.achyuta.binding.SummaryScreen;
import in.achyuta.service.DCService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class DcRestController {
	
	@Autowired
	private DCService dcService;
	
	@GetMapping("/plans")
	public Map<Integer, String> getPlans(){
		return dcService.getPlans();
	}
	
	@PostMapping("/plan-selection")
	public ResponseEntity<String> savePlanSelection(@RequestBody PlanSelection selection){
		boolean status = dcService.savePlanSelction(selection);
		if(status) {
			return new ResponseEntity<>("Plan Selection Saved",HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/income")
	public ResponseEntity<String> saveIncome(@RequestBody Income income){
		boolean status = dcService.saveIncome(income);
		if(status) {
			return new ResponseEntity<>("Income saved",HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("education")
	public ResponseEntity<String> savePlanSelection(@RequestBody Education education){
		boolean status = dcService.saveEducation(education);
		if(status) {
			return new ResponseEntity<>("Education Created",HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/kids")
	public ResponseEntity<String> savePlanSelection(@RequestBody Kids kids){
		boolean status = dcService.saveKids(kids);
		if(status) {
			return new ResponseEntity<>("Plan Selection Created",HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/dc-summary/{caseNum}")
	public ResponseEntity<SummaryScreen> getDcSummary(@PathVariable Long caseNum){
		SummaryScreen fetchSummaryInfo = dcService.fetchSummaryInfo(caseNum);
		return new ResponseEntity<>(fetchSummaryInfo,HttpStatus.OK);
	}
	

}
