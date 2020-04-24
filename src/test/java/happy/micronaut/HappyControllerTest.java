package happy.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class HappyControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testHappyResponse() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/marek"));
        assertEquals("Be happy, marek", response); //)
    }
}
