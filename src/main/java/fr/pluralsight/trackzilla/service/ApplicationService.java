package fr.pluralsight.trackzilla.service;

import java.util.List;
import fr.pluralsight.trackzilla.entity.Application;

public interface ApplicationService {
  List<Application> listApplications();

  Application findApplication(long id);
}
