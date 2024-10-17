package almoco.com.almoco.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import almoco.com.almoco.Model.Model;

public interface repository extends JpaRepository<Model,UUID > {

	
	
}
