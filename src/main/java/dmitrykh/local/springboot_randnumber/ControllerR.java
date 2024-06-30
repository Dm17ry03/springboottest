package dmitrykh.local.springboot_randnumber;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ControllerR {
    @GetMapping("/getRandomNum")
    public RandNum getRandomNum() {
        RandLimit randLimit = new RandLimit();
        RandNum randNum = new RandNum(randLimit);
        return randNum;
    }

    @GetMapping("/getRandomLimit")
    public RandLimit getRandomLimit() {
        // the num is 1000, will be changed later
        RandLimit randLimit = new RandLimit();
        return randLimit;
    }

    @GetMapping("/getMyRandNum")
    public RandNum getMyRandNum(int setNewRandomLimit) {
        RandLimit randLimit = new RandLimit();
        randLimit.setRandLimit(setNewRandomLimit);
        RandNum randNum = new RandNum(randLimit);
        return randNum;
    }
    @PostMapping("/changeMyRandNum")
    public RandNum changeMyRandNum (@RequestBody RandLimit randLimit) {
        RandNum randNum = new RandNum(randLimit);
        return randNum;
    }

}
