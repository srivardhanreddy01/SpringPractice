package com.example.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class WelcomeController{

  @GetMapping("/welcome")
  public String welcome(){
    System.out.println("hi");
    return "Welcome";
  }
}
//@Controller
//public class HomeController {
//
//  @RequestMapping("home")
////  @ResponseBody
//  public String home(){
//    System.out.println("hi");
//    return "home.jsp";
//  }
//}
