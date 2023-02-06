package com.greeting_app.controller;

import com.greeting_app.model.GreetingModel;
import com.greeting_app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Greetingcontroller {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/hello")
    public String print() {
        return greetingService.printHello();
    }

    @PostMapping("/post")
    public GreetingModel add(@RequestBody GreetingModel greetingModel) {
        return greetingService.addGreet(greetingModel);
    }

    @GetMapping("/get")
    public List<GreetingModel> view() {
        return greetingService.viewGreet();
    }

    @GetMapping("/get/{id}")
    public GreetingModel viewById(@PathVariable Long id) {
        return greetingService.viewGreetById(id);
    }

    @PutMapping("/put/{id}")
    public GreetingModel editById(@PathVariable Long id, @RequestBody GreetingModel greetingModel) {
        return greetingService.editGreetById(id,greetingModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        greetingService.deleteGreetById(id);
    }
}
