package com.jos.dem.springboot.geb.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.jos.dem.springboot.geb.service.PersonService;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("persons/**")
public class PersonController {

  @Autowired
  private PersonService personService;

  Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(method=GET)
  public String persons(final Model model){
    log.info("Listing persons");
    model.addAttribute("persons", personService.getAll());
    return "list";
  }

}