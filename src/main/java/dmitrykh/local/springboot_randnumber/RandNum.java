package dmitrykh.local.springboot_randnumber;
import java.util.Random;

public class RandNum {
    Random rand;
    RandLimit randLimit;
    int num;

    public RandNum(RandLimit randLimitArg) {
        randLimit = randLimitArg;
        rand = new Random();
        num = rand.nextInt(randLimit.getRandLimit());
    }

    public int getNum() {
        return num;
    }

    public int getRandLimit() {
        return randLimit.getRandLimit();
    }

    public void genNewNum(int newNum) {
        randLimit.setRandLimit(newNum);
        num = rand.nextInt(randLimit.getRandLimit());
    }
}
