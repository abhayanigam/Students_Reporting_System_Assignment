package com.studentreporting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StudentReportingSystemApplication extends SpringBootServletInitializer {


//  @Override
//  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//    return builder.sources(StudentReportingSystemApplication.class);
//  }

  public static void main(String[] args) {
    SpringApplication.run(StudentReportingSystemApplication.class);
  }
//
//  public static void main(String[] args) {
//
//    SpringApplication app = new SpringApplication(StudentReportingSystemWebConfig.class);
//    app.run(StudentReportingSystemApplication.class, args);
//  }
}
