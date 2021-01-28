package me.jko.demospringaop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAspect {

  @Around("bean(myEvent)")
  public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    log.info("Before Event Publish");

    Object proceed = proceedingJoinPoint.proceed(); // real target // myEvent.method

    return proceed;
  }

  @AfterReturning("bean(myEvent)")
  public void afterReturningTest() {
    log.info("After Event Publish");
  }
}
