package all.algorythmica.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class taskController {
    @GetMapping
    public String home(){
        return "Test";
    }
}
