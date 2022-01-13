package fr.pluralsight.trackzilla.repository;

import fr.pluralsight.trackzilla.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
