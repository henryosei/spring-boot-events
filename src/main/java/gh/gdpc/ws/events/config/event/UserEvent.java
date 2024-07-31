package gh.gdpc.ws.events.config.event;

import gh.gdpc.ws.events.domain.User;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class UserEvent extends ApplicationEvent {
    public UserEvent(Object source, User user) {
        super(source);
        System.out.println(user.getPassword());
    }
}
