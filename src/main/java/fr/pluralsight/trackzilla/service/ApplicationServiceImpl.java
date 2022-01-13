package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Application;
import fr.pluralsight.trackzilla.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
  @Autowired
  private ApplicationRepository applicationRepository;

  @Override
  public Iterable<Application> listApplications() {
    return applicationRepository.findAll();
  }

}
