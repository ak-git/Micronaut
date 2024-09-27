package com.ak.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.EmbeddedApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MntTest {
  private static final EmbeddedApplication<?> application = ApplicationContext.run(EmbeddedApplication.class);

  @AfterAll
  static void tearDown() {
    application.stop();
  }

  @Test
  void testItWorks() {
    Assertions.assertTrue(application.isRunning());
  }
}
