package lv.rcs.tasks.task09;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {

    @org.junit.jupiter.api.Test
    void generatePrimes() {

        int[] actual = PrimeGenerator.generatePrimes(10);

        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertArrayEquals(expected, actual);
    }
}