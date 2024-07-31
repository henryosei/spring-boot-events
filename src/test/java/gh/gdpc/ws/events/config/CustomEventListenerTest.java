package gh.gdpc.ws.events.config;

import org.junit.jupiter.api.BeforeAll;

import static org.awaitility.Awaitility.given;
import static org.junit.jupiter.api.Assertions.*;

class CustomEventListenerTest {


    @BeforeAll
    public static void beforeAll() {
        assertEquals(10, 10);
        System.out.println("Testing custom listener");
    }
}