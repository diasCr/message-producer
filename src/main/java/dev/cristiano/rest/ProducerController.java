package dev.cristiano.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private static final Map<String, UsertaskDto> CACHE = new HashMap<>();

    @PostMapping("/usertasks")
    public ResponseEntity<UsertaskDto> create(@RequestBody UsertaskDto newUsertask) {
        String uniqueID = UUID.randomUUID().toString();
        newUsertask.setUuid(uniqueID);
        CACHE.put(uniqueID, newUsertask);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUsertask);
    }

    @PostMapping("/usertasks/{id}/completions")
    public ResponseEntity<CompletionDto> complete(@PathVariable(value = "id") String uuid,
            @RequestBody CompletionDto completion) {

        UsertaskDto usertask = CACHE.get(uuid);

        if (usertask == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } else {
            if (usertask.getCompletionMetadata().isCompletionMessageRequired()) {
                // send message
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        }
    }
}
