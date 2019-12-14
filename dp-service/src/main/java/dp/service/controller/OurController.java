package dp.service.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class OurController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/ping")
    @ResponseBody
    String ping() {
        return "pong";
    }

    @RequestMapping("/yo/{name}")
    @ResponseBody
    String yo(@PathVariable String name) {
        return "YO " + name;
    }

}
