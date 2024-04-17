package com.example.demo;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/bypath/{text}")
    public ResponseEntity<Homework> getHomeworkPath(@PathVariable String text){
        return ResponseEntity.ok(new Homework(text));

    }

    @GetMapping("/byparam")
    public ResponseEntity<Homework> getHomeworkParam(@RequestParam String text){
        return ResponseEntity.ok(new Homework(text));
    }

    @PutMapping("/update/{text}")
    public ResponseEntity<Homework> putHomework(@PathVariable String text, @RequestBody Homework homework){
        homework.setText(text);
        return ResponseEntity.ok(homework);
    }

    @PostMapping( "/create")
    public ResponseEntity<Homework> postHomework(@RequestBody Homework homework){
        return ResponseEntity.ok(homework);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Homework> deleteHomework(){
        return ResponseEntity.ok().build();
    }


}


