package com.example.kafkatest.shared.member.event;

import com.example.kafkatest.shared.member.dto.MemberDto;
import com.example.kafkatest.standard.event.HaveEventName;

public record MemberJoinedEvent(MemberDto memberDto) implements HaveEventName {
}
