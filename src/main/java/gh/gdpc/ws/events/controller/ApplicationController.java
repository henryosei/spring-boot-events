package gh.gdpc.ws.events.controller;

import gh.gdpc.ws.events.config.CustomEventPublisher;
import gh.gdpc.ws.events.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {


    private JdbcTemplate jdbcTemplate;





    public User application(@RequestBody User user){

        return user;
    }
}
