package com.example.kafkatest.infra.kafka;


import java.util.concurrent.CountDownLatch;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

  private final CountDownLatch latch = new CountDownLatch(1);
  private MyEvent receivedEvent;

  @KafkaListener(topics = "MyEvent")
  public void handle(MyEvent event) {
    System.out.println("handle MyEvent: " + event.msg());
    this.receivedEvent = event;
    latch.countDown();
  }

  public CountDownLatch getLatch() {
    return latch;
  }

  public MyEvent getReceivedEvent() {
    return receivedEvent;
  }
}