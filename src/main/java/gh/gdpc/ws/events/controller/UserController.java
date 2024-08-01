package gh.gdpc.ws.events.controller;

import gh.gdpc.ws.events.config.event.UserEvent;
import gh.gdpc.ws.events.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {


    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        eventPublisher.publishEvent(new UserEvent(this, user));

        return user;
    }
}
