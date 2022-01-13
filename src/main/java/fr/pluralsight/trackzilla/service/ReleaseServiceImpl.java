package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Release;
import fr.pluralsight.trackzilla.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {
  @Autowired
  private ReleaseRepository releaseRepository;

  @Override
  public Iterable<Release> listReleases() {
    return releaseRepository.findAll();
  }

}
