package com.galvanize.pairing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PairingApplicationTests {

    @Test
    void testAddTwoNumbers() {
        Number two = new Number(2);
        Number three = new Number(3);
        Number expected = new Number(5);

        // Exercise
        Number actual = two.plus(three);

        // Assert
        assertEquals(expected, actual);

    }

}
