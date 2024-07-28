package dmitrykh.local.springboot_randnumber.controller;

import dmitrykh.local.springboot_randnumber.service.RandNumGenerator;
import org.springframework.web.bind.annotation.*;
import dmitrykh.local.springboot_randnumber.model.RandNum;
import dmitrykh.local.springboot_randnumber.model.RandLimit;

@RestController
@RequestMapping("/api")
public class ControllerR {
    RandLimit randLimit = new RandLimit();

    @GetMapping("/getRandomNum")
    public RandNum getRandomNum() {
        RandNumGenerator randNumGenerator = new RandNumGenerator();
        RandNum randNum = new RandNum().num(randNumGenerator.genNum(randLimit.getRandLimit()));
        return randNum;
    }

    @GetMapping("/getRandomLimit")
    public RandLimit getRandomLimit() {
        // the num is 1000, can be changed later
        return randLimit;
    }

    @PostMapping("/changeMyRandNum")
    public RandNum changeMyRandNum (@RequestBody RandLimit randLimitarg) {
        RandNumGenerator randNumGenerator = new RandNumGenerator();
        RandNum randNum = new RandNum().num(randNumGenerator.genNum(randLimitarg.getRandLimit()));
        return randNum;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
