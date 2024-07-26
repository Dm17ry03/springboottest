package dmitrykh.local.springboot_randnumber;

import org.springframework.web.bind.annotation.*;
import dmitrykh.local.springboot_randnumber.model.RandNum;
import dmitrykh.local.springboot_randnumber.model.RandLimit;

@RestController
@RequestMapping("/api")

public class ControllerR {
    @GetMapping("/getRandomNum")
    public RandNum getRandomNum() {
        RandLimit randLimit = new RandLimit();
        RandNumGenerator randNumGenerator = new RandNumGenerator(randLimit);
        RandNum randNum = new RandNum().num(randNumGenerator.genNum());
        return randNum;
    }

    @GetMapping("/getRandomLimit")
    public RandLimit getRandomLimit() {
        // the num is 1000, will be changed later
        RandLimit randLimit = new RandLimit();
        return randLimit;
    }
    @PostMapping("/changeMyRandNum")
    public RandNum changeMyRandNum (@RequestBody RandLimit randLimit) {
        RandNumGenerator randNumGenerator = new RandNumGenerator(randLimit);
        RandNum randNum = new RandNum().num(randNumGenerator.genNum());
        return randNum;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
