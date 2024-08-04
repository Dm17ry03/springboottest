package dmitrykh.local.springboot_randnumber.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandNumGenerator {
    Random rand = new Random();

    public int genNum(Integer randlimit) {
        return rand.nextInt(randlimit);
    }
}
