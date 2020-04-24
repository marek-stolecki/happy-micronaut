package happy.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HappyController {

    @Get("/{name}")
    public String getMeHappy(String name) {
        return "Be happy, " + name;
    }
}
