package dmitrykh.local.springboot_randnumber.controller;

import dmitrykh.local.springboot_randnumber.service.RandNumGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dmitrykh.local.springboot_randnumber.model.RandNum;
import dmitrykh.local.springboot_randnumber.model.RandLimit;

@RestController
@RequestMapping("/api")
public class ControllerR {
    RandLimit randLimit = new RandLimit();

    @Autowired
    RandNumGenerator randNumGenerator;

    @GetMapping("/getRandomNum")
    public RandNum getRandomNum() {
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
        RandNum randNum = new RandNum().num(randNumGenerator.genNum(randLimitarg.getRandLimit()));
        return randNum;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
