package vttp_b5_paf_day5.day5_producer.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import vttp_b5_paf_day5.day5_producer.model.Todo;
import vttp_b5_paf_day5.day5_producer.service.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/messages")
public class ProducerController {
    
    @Autowired
    ProducerService ps;
    
    @PostMapping("")
    public ResponseEntity<String> sendMessage(@RequestBody Todo todo) {
        
        ps.sendMessage(todo);

        return new ResponseEntity<>("Message sent", HttpStatus.OK);
    }
    
}
