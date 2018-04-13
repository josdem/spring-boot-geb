package com.jos.dem.springboot.geb

import geb.spock.GebReportingSpec
import com.jos.dem.springboot.geb.pages.PersonList

class CreatePersonSpec extends GebReportingSpec {

  void 'should create person'() {
    given:
      go "http://localhost:8080/create"

    when:
      $("input", name: "nickname").value("josdem")
      $("input", name: "email").value("joseluis.delacruz@gmail.com")
      $("button", name: "submit").click()

    then:
      at PersonList
    }

}
