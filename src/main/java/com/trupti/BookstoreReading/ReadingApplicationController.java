package com.trupti.BookstoreReading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ReadingApplicationController {
    @Autowired
    private BookService bookService;



    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }

}
