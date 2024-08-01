package gh.gdpc.ws.events.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomApplicationEvent> {

    @Override
    @EventListener()
    public void onApplicationEvent(CustomApplicationEvent event) {
        System.out.println("Received spring custom event - " + event.getEventName());

    }
}
