package fr.pluralsight.trackzilla.exception;

public class ApplicationNotFoundException extends RuntimeException {

  public ApplicationNotFoundException(String exception) {
    super(exception);
  }
}
