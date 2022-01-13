package fr.pluralsight.trackzilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TrackzillaApplication {

  public static void main(String[] args) {
    SpringApplication.run(TrackzillaApplication.class, args);
  }

}
