package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @RequestMapping("/")
    public String index() {
        return "Congratulations from controller.RoleController.java";
    }
}
