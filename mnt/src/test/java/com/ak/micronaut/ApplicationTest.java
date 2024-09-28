package com.ak.micronaut;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.Appender;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.EmbeddedApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {
  private static final EmbeddedApplication<?> APPLICATION = ApplicationContext.run(EmbeddedApplication.class);
  private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ApplicationTest.class.getPackageName());

  @Mock
  private Appender<ILoggingEvent> appender;
  @Captor
  private ArgumentCaptor<LoggingEvent> loggingEventCaptor;

  @BeforeEach
  void setUp() {
    LOGGER.addAppender(appender);
  }

  @AfterEach
  void cleanUp() {
    LOGGER.detachAppender(appender);
  }

  @AfterAll
  static void tearDown() {
    APPLICATION.stop();
  }

  @Test
  void testItWorks() {
    assertThat(APPLICATION.isRunning()).isTrue();
    assertThatNoException().isThrownBy(() -> Application.main(new String[] {}));

    Mockito.verify(appender).doAppend(loggingEventCaptor.capture());

    assertThat(loggingEventCaptor.getAllValues()).hasSize(1);
    LoggingEvent loggingEvent = loggingEventCaptor.getAllValues().getFirst();
    assertThat(loggingEvent.getFormattedMessage()).isEqualTo("mnt running = true");
    assertThat(loggingEvent.getLevel()).isEqualTo(Level.INFO);
  }
}
