package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private String captureOutput(int[] values) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int[] current = new int[values.length];
        Factorial.generateSubsets(values, 0, current, 0);

        System.setOut(System.out);
        return out.toString();
    }

    @Test
    public void testEmptyArray() {
        String output = captureOutput(new int[]{});
        assertEquals("{}", output.trim());
    }

    @Test
    public void testOneElement() {
        String output = captureOutput(new int[]{1});
        String[] lines = output.trim().split("\n");
        assertEquals(2, lines.length); // {} и {1}
    }

    @Test
    public void testTwoElements() {
        String output = captureOutput(new int[]{1, 2});
        String[] lines = output.trim().split("\n");
        assertEquals(4, lines.length); // 2^2 = 4
    }

    @Test
    public void testThreeElements() {
        String output = captureOutput(new int[]{1, 2, 3});
        String[] lines = output.trim().split("\n");
        assertEquals(8, lines.length); // 2^3 = 8
    }

    @Test
    public void testEmptySubsetExists() {
        String output = captureOutput(new int[]{1, 2, 3});
        assertTrue(output.contains("{}"));
    }

    @Test
    public void testFullSubsetExists() {
        String output = captureOutput(new int[]{1, 2, 3});
        assertTrue(output.contains("{1, 2, 3}"));
    }
}