package dmitrykh.local.springboot_randnumber;

import java.util.Random;
import dmitrykh.local.springboot_randnumber.model.RandLimit;

public class RandNumGenerator {
    Random rand;
    RandLimit randLimit;

    public RandNumGenerator(RandLimit randLimitArg) {
        randLimit = randLimitArg;
        rand = new Random();
    }

    public int genNum() {
        return rand.nextInt(randLimit.getRandLimit());
    }
}
