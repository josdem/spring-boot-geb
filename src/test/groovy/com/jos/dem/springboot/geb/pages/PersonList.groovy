package com.jos.dem.springboot.geb.pages

import geb.Page

class PersonList extends Page {

  static url = "persons/list"
  static at = { title == "Person List" }
  static content = {
  }

}
