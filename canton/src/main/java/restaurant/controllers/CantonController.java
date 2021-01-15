package restaurant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CantonController {

  @RequestMapping("/canton")
  public String index() {
    return "canton.html";
  }
}
