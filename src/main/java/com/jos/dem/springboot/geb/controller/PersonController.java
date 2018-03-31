package com.jos.dem.springboot.geb.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("persons/**")
public class PersonController {

  Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(method=GET)
  public String persons(){
    log.info("Listing persons");
    return "list";
  }

}