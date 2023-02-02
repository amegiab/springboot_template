package com.basf.${{values.java_package_name}};

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

  @GetMapping(value = "/demo")
  public String HelloWorld(){
    return "Hello Demo";
  }

}