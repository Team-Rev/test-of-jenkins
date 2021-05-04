package ci.cd.jenkins.controller;

import ci.cd.jenkins.model.entity.Jenkins;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/Hello")
    public String welcome() {
        Jenkins jenkins = Jenkins.builder()
                .name("eunsil")
                .build();

        return "Hello " + jenkins.getName() + "!";
    }
}