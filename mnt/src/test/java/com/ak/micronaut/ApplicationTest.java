package com.ak.micronaut;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;

@MicronautTest(startApplication = false, transactional = false)
class ApplicationTest {
  @Test
  void testItWorks() {
    assertThatNoException().isThrownBy(() -> Application.main(new String[] {}));
  }
}
