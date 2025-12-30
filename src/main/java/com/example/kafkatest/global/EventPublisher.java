package com.example.kafkatest.global;

import com.example.kafkatest.standard.event.HaveEventName;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPublisher {
  private final KafkaTemplate<String, HaveEventName> kafkaTemplate;

  public void publish(HaveEventName event) {
    kafkaTemplate.send(event.getEventName(), event);
  }
}
