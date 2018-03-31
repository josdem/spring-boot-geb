package com.jos.dem.springboot.geb.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.jos.dem.springboot.geb.model.Person;
import com.jos.dem.springboot.geb.service.PersonService;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {

  private Map<String, Person> persons = new HashMap<String, Person>();

  public Flux<Person> getAll(){
    return Flux.fromIterable(persons.values());    
  }

  public Mono<Person> getByNickname(String nickname){
    return Mono.just(persons.get(nickname));
  }

  public void save(Person person){
    persons.put(person.getNickname(), person);
  }

}