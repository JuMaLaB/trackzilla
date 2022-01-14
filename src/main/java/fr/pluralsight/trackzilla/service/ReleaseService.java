package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Release;

import java.util.List;

public interface ReleaseService {
  List<Release> listReleases();
}
