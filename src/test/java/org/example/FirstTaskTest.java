package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskTest {

    @Test
    public void testBaseCase() {
        assertEquals(9, FirstTask.gcd(9, 0));
        assertEquals(5, FirstTask.gcd(5, 0));
    }

    @Test
    public void testFromTask() {
        assertEquals(4, FirstTask.gcd(12, 8));
        assertEquals(1, FirstTask.gcd(17, 5));
        assertEquals(7, FirstTask.gcd(21, 7));
        assertEquals(9, FirstTask.gcd(9, 0));
    }

    @Test
    public void testMore() {
        assertEquals(1, FirstTask.gcd(1, 1));
        assertEquals(6, FirstTask.gcd(6, 6));
    }
}