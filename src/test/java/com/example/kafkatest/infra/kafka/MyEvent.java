package com.example.kafkatest.infra.kafka;

import com.example.kafkatest.standard.event.HaveEventName;

public record MyEvent(String msg) implements HaveEventName {
}