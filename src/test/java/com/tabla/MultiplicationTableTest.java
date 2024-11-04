package com.tabla;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableTest {
    
    @Test
    public void testMultiplicationTableFor5() {
        MultiplicationTable table = new MultiplicationTable();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; 
        System.setOut(new PrintStream(outputStream));

        table.printMultiplicationTable(5);

        String lineSeparator = System.lineSeparator();
        String expectedOutput = "5 x 1 = 5" + lineSeparator +
                "5 x 2 = 10" + lineSeparator +
                "5 x 3 = 15" + lineSeparator +
                "5 x 4 = 20" + lineSeparator +
                "5 x 5 = 25" + lineSeparator +
                "5 x 6 = 30" + lineSeparator +
                "5 x 7 = 35" + lineSeparator +
                "5 x 8 = 40" + lineSeparator +
                "5 x 9 = 45" + lineSeparator +
                "5 x 10 = 50" + lineSeparator;

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(originalOut);
    }

    @Test
    public void testMultiplicationTableFor10() {
        MultiplicationTable table = new MultiplicationTable();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        table.printMultiplicationTable(10);

        String lineSeparator = System.lineSeparator();
        String expectedOutput = "10 x 1 = 10" + lineSeparator +
                "10 x 2 = 20" + lineSeparator +
                "10 x 3 = 30" + lineSeparator +
                "10 x 4 = 40" + lineSeparator +
                "10 x 5 = 50" + lineSeparator +
                "10 x 6 = 60" + lineSeparator +
                "10 x 7 = 70" + lineSeparator +
                "10 x 8 = 80" + lineSeparator +
                "10 x 9 = 90" + lineSeparator +
                "10 x 10 = 100" + lineSeparator;

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(originalOut);
    }
}