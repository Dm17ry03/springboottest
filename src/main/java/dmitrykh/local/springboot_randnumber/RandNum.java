package dmitrykh.local.springboot_randnumber;
import java.util.Random;

public class RandNum {
    Random rand = new Random();
    int num = rand.nextInt(1000);

    public int getNum() {
        return num;
    }
}
