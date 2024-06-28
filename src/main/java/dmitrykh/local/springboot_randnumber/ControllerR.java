package dmitrykh.local.springboot_randnumber;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ControllerR {
    @GetMapping("/getRandomNum")
    public int getRandomNum() {
        return new Random().nextInt(1000);
    }
}
