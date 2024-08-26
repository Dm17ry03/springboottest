package dmitrykh.local.springboot_randnumber.service;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class RandNumGeneratorTest {
    RandNumGenerator randNumGenerator;

    public RandNumGeneratorTest(@Autowired RandNumGenerator randNumGenerator) {
        this.randNumGenerator = randNumGenerator;
    }


    @RepeatedTest(10)
    void genNum() {
        Integer randlimit = 1000;
        int result = randNumGenerator.genNum(randlimit);
        assertTrue(result < randlimit);
    }
}