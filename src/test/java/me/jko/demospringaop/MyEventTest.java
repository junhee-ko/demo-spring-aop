package me.jko.demospringaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

@SpringBootTest
class MyEventTest {

  @Autowired
  private MyEvent myEvent;

  @Test
  void test() {
    myEvent.publishEvent();
  }
}