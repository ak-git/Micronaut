package com.ak.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.EmbeddedApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

class ApplicationTest {
  private static final EmbeddedApplication<?> APPLICATION = ApplicationContext.run(EmbeddedApplication.class);

  @AfterAll
  static void tearDown() {
    APPLICATION.stop();
  }

  @Test
  void testItWorks() {
    assertThat(APPLICATION.isRunning()).isTrue();
    assertThatNoException().isThrownBy(() -> Application.main(new String[] {}));
  }
}
