package one.digital.innovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonCOntroller {

    @GetMapping
    public String getBook() {
        return "API Test!";
    }
}
