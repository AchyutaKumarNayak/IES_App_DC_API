package in.achyuta.service;

import java.util.Map;

import in.achyuta.binding.Education;
import in.achyuta.binding.Income;
import in.achyuta.binding.Kids;
import in.achyuta.binding.PlanSelection;
import in.achyuta.binding.SummaryScreen;

public interface DCService {
	
	public Map<Integer, String> getPlans();
	
	public boolean savePlanSelction(PlanSelection selection);
	
	public boolean saveIncome(Income income);
	
	public boolean saveEducation(Education education);
	
	public boolean saveKids(Kids kids);
	
	public SummaryScreen fetchSummaryInfo(Long caseNum);

}
