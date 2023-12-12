package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void increasedLine() {
        Assertions.assertEquals("VovaVova", StringProcessor.increasedLine("Vova", 2));
        Assertions.assertEquals("", StringProcessor.increasedLine("", 5));
        Assertions.assertEquals("", StringProcessor.increasedLine("Vova", 0));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.increasedLine(lineTest, 5);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.increasedLine("Vova", -1);
        });
    }

    @Test
    void countLines() {
        Assertions.assertEquals(3, StringProcessor.countLines(" AVavksndgAVklnldgpsjgoipAV ", "AV"));
        Assertions.assertEquals(0, StringProcessor.countLines("", "Vova"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.countLines("sdf", lineTest);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.countLines("sdf", "");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.countLines(lineTest, "dima");
        });
    }

    @Test
    void removeLines() {
        Assertions.assertEquals("один", StringProcessor.removeLines("1"));
        Assertions.assertEquals("одиндва", StringProcessor.removeLines("12"));
        Assertions.assertEquals("одиндватри", StringProcessor.removeLines("123"));
        Assertions.assertEquals("dsfrvодин ss", StringProcessor.removeLines("dsfrv1 ss"));
        Assertions.assertEquals("sasaHTGFтри567sfdfKUJYGодинOJK___два44два ", StringProcessor.removeLines("sasaHTGF3567sfdfKUJYG1OJK___2442 "));
        Assertions.assertEquals("", StringProcessor.removeLines(""));
        Assertions.assertEquals("kekWUEUHRтри95", StringProcessor.removeLines("kekWUEUHR395"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.removeLines(lineTest);
        });

    }

    @Test
    void deleteSecondSymbol() {
        Assertions.assertEquals("vv", StringProcessor.deleteSecondSymbol("vova"));
        Assertions.assertEquals("     ", StringProcessor.deleteSecondSymbol(" a s d f "));
        Assertions.assertEquals("", StringProcessor.deleteSecondSymbol(""));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.deleteSecondSymbol(lineTest);
        });
    }


    @Test
    void reverseString() {
        Assertions.assertEquals("gg bydet", StringProcessor.reverseString("bydet gg"));
        Assertions.assertEquals(" dd  cc bbb aaa", StringProcessor.reverseString(" aaa  bbb cc dd"));
        Assertions.assertEquals("blabla", StringProcessor.reverseString("blabla"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringProcessor.reverseString(lineTest);
        });
    }
}
