import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantNumberTest {

    private ConstantNumber constantNumber;

    @Test
    void getValueZero() {
        int Zero = 0;
        ConstantNumber constantNumber = ConstantNumber.ZERO;
        int result = constantNumber.getValue();
        assertEquals(Zero, result);
    }

    @Test
    void getValueOne() {
        int One = 1;
        ConstantNumber constantNumber = ConstantNumber.ONE;
        int result = constantNumber.getValue();
        assertEquals(One, result);
    }

    @Test
    void getValueTwo() {
        int two = 2;
        constantNumber = ConstantNumber.TWO;
        int result = constantNumber.getValue();
        assertEquals(two, result);
    }

    @Test
    void getValueThree() {
        int three = 3;
        constantNumber = ConstantNumber.THREE;
        int result = constantNumber.getValue();
        assertEquals(three, result);
    }

    public static void main(String[] args) {

    }

}