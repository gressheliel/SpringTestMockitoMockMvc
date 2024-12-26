package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest extends BaseUtilsTest{

    @Test
    @DisplayName("0. Equals and Not Equals")
    @Order(0)
    void testEqualsAndNotEquals(){
        System.out.println("1. Running testEqualsAndNotEquals.............");
        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(10, demoUtils.add(2, 6), "2 + 6 must not be 10");
    }

    @Test
    @DisplayName("1. Equals and Not Equals, Multiply")
    @Order(1)
    void testEqualsAndNotEqualsMultiply(){
        System.out.println("1. Running testEqualsAndNotEquals.............");
        assertEquals(8, demoUtils.multiply(2, 4), "2 * 4 must be 8");
        assertNotEquals(11, demoUtils.multiply(2, 6), "2 * 6 must not be 11");
    }
    @Test
    @DisplayName("2. Null and Not Null")
    @Order(2)
    void testNullAndNotNull(){
        System.out.println("2. Running testNullAndNotNull............");
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object must be null");
        assertNotNull(demoUtils.checkNull(str2), "Object must not be null");
    }

    @Test
    @DisplayName("3. Same and Not Same")
    @Order(3)
    void testSameAndNotSame(){
        System.out.println("3. Running testSameAndNotSame............");

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object must be the same");
        assertNotSame(new String("Luv2Code Academy") ,demoUtils.getAcademyDuplicate(), "Object must not be the same");
    }

    @Test
    @DisplayName("4. True and False")
    @Order(4)
    void testTrueFalse(){
        System.out.println("4. Running testTrueFalse............");

        assertTrue(demoUtils.isGreater(6,5), "Should return  true");
        assertFalse(demoUtils.isGreater(6,7), "Should return false");
    }

    @Test
    @DisplayName("5. Array Equals")
    @Order(5)
    void testArrayEquals(){
        System.out.println("5. Running testArrayEquals............");
        String[] arrayString = {"A","B","C"};
        assertArrayEquals(arrayString,
                demoUtils.getFirstThreeLettersOfAlphabet(), "AssertArrayEquals Should return  true");
    }

    @Test
    @DisplayName("6. Iterable Equals")
    @Order(6)
    void testIterableEquals(){
        System.out.println("6. Running testIterableEquals............");
        List<String> listString = List.of("luv", "2", "code");
        assertIterableEquals(listString,
                demoUtils.getAcademyInList(), "AssertIterableEquals Should return  true");
    }

    @Test
    @DisplayName("7. Lines match")
    @Order(7)
    void testLinesMatch(){
        System.out.println("7. Running testLinesMatch............");
        List<String> listString = List.of("luv", "2", "code");
        assertLinesMatch(listString,
                demoUtils.getAcademyInList(), "LinesMatch Should return  true");
    }

    @Test
    @DisplayName("8. Throws and Does not Throw Exception")
    @Order(8)
    void testThrowsAndDoesNotThrow(){
        System.out.println("8. Running testThrowsAndDoesNotThrow............");

        assertThrows( Exception.class,
                ()-> { demoUtils.throwException(-1);},
                "Should throws an exception");

        assertDoesNotThrow( ()-> {demoUtils.throwException(5);},
                "Should not throws an exception");
    }

    //se completa antes de un timeout
    @Test
    @DisplayName("9. Timeout, finish after a time")
    @Order(9)
    void testTimeout(){
        System.out.println("9. Running testTimeout............");
        assertTimeoutPreemptively(Duration.ofSeconds(3), ()->{demoUtils.checkTimeout();});
    }
}
