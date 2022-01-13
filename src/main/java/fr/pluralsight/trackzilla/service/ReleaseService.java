package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Release;

public interface ReleaseService {
  Iterable<Release> listReleases();
}
