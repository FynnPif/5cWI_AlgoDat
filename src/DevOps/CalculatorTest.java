package DevOps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator c;
    @BeforeEach
    void setUp() {
        this.c = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        double result = c.add(3, 5);
        Assertions.assertEquals(3, result);
    }

    @Test
    void subtract() {
        double result = c.subtract(3, 5);
        Assertions.assertEquals(3, result);
    }
}