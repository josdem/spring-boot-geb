package com.jos.dem.springboot.geb.service;

import com.jos.dem.springboot.geb.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
  Flux<Person> getAll();
  Mono<Person> getByNickname(String nickname);
}