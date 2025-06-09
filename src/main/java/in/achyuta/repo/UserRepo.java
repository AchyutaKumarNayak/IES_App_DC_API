package in.achyuta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.achyuta.entities.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	public UserEntity findByUserId(Integer userId);

}
