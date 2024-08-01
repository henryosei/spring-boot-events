package gh.gdpc.ws.events.config;

import gh.gdpc.ws.events.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private RabbitTemplate rabbitTemplate;



    public CustomEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishEvent(User event) {
        System.out.println("Publishing custom event. ");
        rabbitTemplate.convertAndSend("","user-registration", event);
        eventPublisher.publishEvent(event);
    }

    
}
