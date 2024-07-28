package dmitrykh.local.springboot_randnumber.service;

import java.util.Random;

public class RandNumGenerator {
    Random rand = new Random();

    public int genNum(Integer randlimit) {
        return rand.nextInt(randlimit);
    }
}
