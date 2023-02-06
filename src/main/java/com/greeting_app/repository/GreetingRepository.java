package com.greeting_app.repository;

import com.greeting_app.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

//Here, We created the interface for using "Pre-Defined Methods" in the Service Class
public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {
}
