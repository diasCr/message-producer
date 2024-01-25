package dev.cristiano.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @PostMapping("/usertasks")
    public ResponseEntity<UsertaskDto> create(@RequestBody UsertaskDto newUsertask) {
        return ResponseEntity.status(HttpStatus.CREATED).body(newUsertask);
    }

    @PostMapping("/usertasks/{id}/completions")
    public ResponseEntity<UsertaskDto> complete(@RequestBody UsertaskDto newUsertask) {
        return ResponseEntity.status(HttpStatus.CREATED).body(newUsertask);
    }
}
