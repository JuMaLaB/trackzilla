package fr.pluralsight.trackzilla.repository;

import fr.pluralsight.trackzilla.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}