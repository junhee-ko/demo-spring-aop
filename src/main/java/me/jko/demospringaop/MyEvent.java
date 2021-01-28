package me.jko.demospringaop;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEvent {

  public void publishEvent() {
    log.info("Event Published");
  }
}
