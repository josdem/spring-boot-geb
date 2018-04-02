package com.jos.dem.springboot.geb

import geb.spock.GebReportingSpec

class CreatePersonSpec extends GebReportingSpec {

  void 'should create person'() {
    given:
      go "http://localhost:8080/create"

    when:
      $("input", name: "nickname").value("josdem")
      $("input", name: "email").value("joseluis.delacruz@gmail.com")
      $("button", name: "submit").click()

    then:     
      assert $("#search").text().contains("josdem.io")
    }
    
}