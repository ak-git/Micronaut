package com.ak.micronaut;

import io.micronaut.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private Application() {
  }

  public static void main(String[] args) {
    try (ApplicationContext context = ApplicationContext.run(args)) {
      String appName = context.getEnvironment().get("micronaut.application.name", String.class).orElse("");
      LOGGER.atInfo().setMessage(appName).addKeyValue("running", context::isRunning).log();
    }
  }
}