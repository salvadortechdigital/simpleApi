package br.valecard.simpleApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Value("${spring.profiles.active}")
    private String activeProfile;
    @GetMapping("/activeProfile")
    public String index() {
        return activeProfile;
    }
}
