package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @Test
    public void testBaseCase() {
        assertEquals(1, SecondTask.a(0));
        assertEquals(2, SecondTask.a(1));
    }

    @Test
    public void testFromTask() {
        assertEquals(5,  SecondTask.a(2));
        assertEquals(13, SecondTask.a(3));
        assertEquals(34, SecondTask.a(4));
    }

    @Test
    public void testMore() {
        assertEquals(89,  SecondTask.a(5));
        assertEquals(233, SecondTask.a(6));
    }
}
