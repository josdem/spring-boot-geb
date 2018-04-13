package com.jos.dem.springboot.geb.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.jos.dem.springboot.geb.model.Person;
import com.jos.dem.springboot.geb.service.PersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

  @Autowired
  private PersonService personService;

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(method=GET)
  public String persons(final Model model){
    log.info("Listing persons");
    model.addAttribute("persons", personService.getAll());
    return "list";
  }

  @RequestMapping(method=GET ,value="create")
  public String create(final Model model){
    log.info("Creating person");
    model.addAttribute("person", new Person());
    return "create";
  }

  @RequestMapping(method=POST)
  public String save(final Person person, final Model model){
    log.info("Saving person");
    personService.save(person);
    model.addAttribute("persons", personService.getAll());
    return "list";
  }

}
