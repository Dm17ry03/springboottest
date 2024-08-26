package dmitrykh.local.springboot_randnumber.service;

import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandNumGeneratorTest {

    @RepeatedTest(10)
    void genNum() {
        Integer randlimit = 1000;
        RandNumGenerator randNumGenerator = new RandNumGenerator();
        int result = randNumGenerator.genNum(randlimit);
        assertTrue(result < randlimit);
    }
}