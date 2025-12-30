package com.example.kafkatest.boundedContext.member.in;

import com.example.kafkatest.global.EventPublisher;
import com.example.kafkatest.shared.member.dto.MemberDto;
import com.example.kafkatest.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MemberDataInit {

  private final EventPublisher eventPublisher;

  @Bean
  public ApplicationRunner memberDataInitApplicationRunner() {
    return args -> {
      eventPublisher.publish(new MemberJoinedEvent(new MemberDto(1)));
    };
  }
}
