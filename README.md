## Kafka

### 용어 정리
* 토픽: 레코드(이벤트)들이 저장되는 별도의 저장소 (mysql 저장소 같은 개념)
* 레코드: 카프카에서는 이벤트를 레코드라고 부른다.
* 프로듀서: 이벤트를 생성하는 주체
* 컨슈머: 이벤트를 수신하는 주체

### 토픽 생성하여 kafka 에 send
```
// MemberDataInit.java
eventPublisher.publish(new MemberJoinedEvent(new MemberDto(1)));

// EventPublisher.java
@Service
@RequiredArgsConstructor
public class EventPublisher {
  private final KafkaTemplate<String, HaveEventName> kafkaTemplate;

  public void publish(HaveEventName event) {
    kafkaTemplate.send(event.getEventName(), event);
  }
}
```

### 토픽 레코드 확인

![토픽](./src/main/resources/static/image/topics.png)
![레코드](./src/main/resources/static/image/topic_detail.png)


### 레드판다 콘솔 접속
[레드판다 콘솔](http://localhost:8090/overview)