package com.example.kafkatest.standard.event;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface HaveEventName {

  @JsonIgnore
  default String getEventName() {
    return this.getClass().getSimpleName();
  }
}