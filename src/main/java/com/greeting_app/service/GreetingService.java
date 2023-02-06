package com.greeting_app.service;

import com.greeting_app.model.GreetingModel;
import com.greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String printHello() {
        return "Hello World";
    }

    //Here we are create addGreet method for save the greeting message:-
    public GreetingModel addGreet(GreetingModel greetingModel) {
        return greetingRepository.save(greetingModel);
    }

    //Here we are create viewGreet method for view the greeting message:-
    public List<GreetingModel> viewGreet() {
        return greetingRepository.findAll();
    }

    //Here we are create viewGreetById method for view the greeting message by using Id:-
    public GreetingModel viewGreetById(long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    //Here we are create editGreetById method for update the greeting message by using Id:-
    public GreetingModel editGreetById(long id, GreetingModel greetingModel) {
        greetingModel.setId(id);
        return greetingRepository.save(greetingModel);
    }

    //Here we are create deleteGreet method for delete the greeting message by using Id:-
    public void deleteGreetById(long id) {
        greetingRepository.deleteById(id);
    }
}
