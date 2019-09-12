package test2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @RequestMapping("/")
    public String index() {
        return "Congratulations from test2.BlogController.java";
    }
}
