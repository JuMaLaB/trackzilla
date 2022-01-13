package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Application;

public interface ApplicationService {
  Iterable<Application> listApplications();
}
