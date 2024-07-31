package gh.gdpc.ws.events.config.service;

import gh.gdpc.ws.events.config.event.UserEvent;
import gh.gdpc.ws.events.domain.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private ApplicationEventPublisher eventPublisher;

    @Override
    public User createUser(User user) {
        eventPublisher.publishEvent(new UserEvent(this, user));
        return null;
    }
}
