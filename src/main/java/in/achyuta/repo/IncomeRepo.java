package in.achyuta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.achyuta.entities.IncomeEntity;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer>{

}
