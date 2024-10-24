package com.handson.sentiment.config;

import com.handson.sentiment.model.GeneratedLessonOut;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsyncConfig {

    @Bean
    public Map<String, CompletableFuture<GeneratedLessonOut>> taskFutures() {
        return new ConcurrentHashMap<>();
    }
}
