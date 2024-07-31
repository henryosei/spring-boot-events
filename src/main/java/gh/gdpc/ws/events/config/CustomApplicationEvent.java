package gh.gdpc.ws.events.config;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {
    private String eventName;

    public CustomApplicationEvent(Object source, String eventName) {
        super(source);
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }
}
