package in.achyuta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.achyuta.entities.KidsEntity;

public interface KidsRepo extends JpaRepository<KidsEntity, Integer>{

}
