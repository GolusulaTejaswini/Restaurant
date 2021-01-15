package restaurant.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ManagerController {
  @RequestMapping("/dashboard")
  public String index() {
    return "manager.html";
  }
}