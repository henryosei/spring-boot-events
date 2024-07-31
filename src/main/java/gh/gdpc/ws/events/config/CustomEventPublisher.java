package gh.gdpc.ws.events.config;

import gh.gdpc.ws.events.domain.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    private ApplicationEventPublisher eventPublisher;

    public CustomEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishEvent(User event) {
        System.out.println("Publishing custom event. ");
        eventPublisher.publishEvent(event);
    }

    
}
