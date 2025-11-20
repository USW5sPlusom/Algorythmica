package all.algorythmica.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class taskController {
    @GetMapping
    public String home(){
        return "Test";
    }
}
