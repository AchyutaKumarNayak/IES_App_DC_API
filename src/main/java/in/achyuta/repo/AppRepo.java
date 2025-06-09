package in.achyuta.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.achyuta.entities.AppEntity;
import in.achyuta.entities.UserEntity;

@Repository
public interface AppRepo extends JpaRepository<AppEntity, Long>{
	
	public List<AppEntity>  findByUser(UserEntity user);
	

}
