package com.ak.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.EmbeddedApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {
  private static final EmbeddedApplication<?> APPLICATION = ApplicationContext.run(EmbeddedApplication.class);

  @AfterAll
  static void tearDown() {
    APPLICATION.stop();
  }

  @Test
  void testItWorks() {
    Assertions.assertTrue(APPLICATION.isRunning());
  }
}
