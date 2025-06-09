package in.achyuta.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.achyuta.binding.Education;
import in.achyuta.binding.Income;
import in.achyuta.binding.Kids;
import in.achyuta.binding.PlanSelection;
import in.achyuta.binding.SummaryScreen;
import in.achyuta.entities.AppEntity;
import in.achyuta.entities.EducationEntity;
import in.achyuta.entities.IncomeEntity;
import in.achyuta.entities.KidsEntity;
import in.achyuta.entities.PlanSelectionEntity;
import in.achyuta.entities.UserEntity;
import in.achyuta.repo.AppRepo;
import in.achyuta.repo.EducationRepo;
import in.achyuta.repo.IncomeRepo;
import in.achyuta.repo.KidsRepo;
import in.achyuta.repo.PlanSelectionRepo;
import in.achyuta.repo.UserRepo;

@Service
public class DCServiceImpl implements DCService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AppRepo appRepo;
	
	@Autowired
	private PlanSelectionRepo planSelectionRepo;
	
	@Autowired
	private IncomeRepo incomeRepo;
	
	@Autowired
	private EducationRepo educationRepo;
	
	private KidsRepo kidsRepo;

	@Override
	public Map<Integer, String> getPlans() {
		return null;
	}

	@Override
	public boolean savePlanSelction(PlanSelection selection) {
		
		PlanSelectionEntity entity= new PlanSelectionEntity();
		BeanUtils.copyProperties(selection, entity);
		UserEntity byUserId = userRepo.findByUserId(selection.getUserId());
		entity.setUser(byUserId);
		Optional<AppEntity> byId = appRepo.findById(selection.getCaseNum());
		if(byId.isPresent()) {
			AppEntity appEntity = byId.get();
			entity.setApp(appEntity);
			planSelectionRepo.save(entity);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean saveIncome(Income income) {
		
		IncomeEntity entity= new IncomeEntity();
		BeanUtils.copyProperties(income, entity);
		UserEntity byUserId = userRepo.findByUserId(income.getUserId());
		entity.setUser(byUserId);
		Optional<AppEntity> byId = appRepo.findById(income.getCaseNum());
		if(byId.isPresent()) {
			AppEntity appEntity = byId.get();
			entity.setApp(appEntity);
			incomeRepo.save(entity);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean saveEducation(Education education) {
		
		EducationEntity entity= new EducationEntity();
		BeanUtils.copyProperties(education, entity);
		UserEntity byUserId = userRepo.findByUserId(education.getUserId());
		entity.setUser(byUserId);
		Optional<AppEntity> byId = appRepo.findById(education.getCaseNum());
		if(byId.isPresent()) {
			AppEntity appEntity = byId.get();
			entity.setApp(appEntity);
			educationRepo.save(entity);
			return true;
		}
		return false;
	}

	@Override
	public boolean saveKids(Kids kids) {
		
		KidsEntity entity= new KidsEntity();
		BeanUtils.copyProperties(kids, entity);
		UserEntity byUserId = userRepo.findByUserId(kids.getUserId());
		entity.setUser(byUserId);
		Optional<AppEntity> byId = appRepo.findById(kids.getCaseNum());
		if(byId.isPresent()) {
			AppEntity appEntity = byId.get();
			entity.setApp(appEntity);
			kidsRepo.save(entity);
			return true;
		}
		return false;
	}

	@Override
	public SummaryScreen fetchSummaryInfo(Long caseNum) {
		return null;
	}

}
