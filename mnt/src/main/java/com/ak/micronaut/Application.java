package com.ak.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private Application() {
  }

  public static void main(String[] args) {
    ApplicationContext context = Micronaut.run(Application.class, args);
    String appName = context.getEnvironment().get("micronaut.application.name", String.class).orElse("");
    LOGGER.info("{} running = {}", appName, context.isRunning());
  }
}