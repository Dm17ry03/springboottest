package dmitrykh.local.springboot_randnumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ControllerR {
    @GetMapping("/getRandomNum")
    public RandNum getRandomNum() {
        RandNum randNum = new RandNum();
        return randNum;
    }
}
