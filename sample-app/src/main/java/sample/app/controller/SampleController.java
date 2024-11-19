package sample.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.app.config.Config;

@RestController
@RequestMapping("/api/v1/sample")
public class SampleController {

    private final Config config;

    public SampleController(Config config) {
        this.config = config;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, config value: " + config.getProperty();
    }

}
