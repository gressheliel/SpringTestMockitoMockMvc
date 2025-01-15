package org.elhg.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // Divisible entre 3  Fizz
    // Divisible entre 5  Buzz
    // Divisible entre 3 y entre 5 FizzBuzz
    // Cualquier otro caso imprime numero

    @DisplayName("1. Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.computer(3), "Should print Fizz");
    }

    @DisplayName("2. Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.computer(5), "Should print Buzz");
    }

    @DisplayName("3. Divisible by Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.computer(15), "Should print FizzBuzz");
    }

    @DisplayName("4. Not Divisible by Three or Five")
    @Test
    @Order(3)
    void testForNonDivisibleByThreeOrFive(){
        String expected = "14";
        assertEquals(expected, FizzBuzz.computer(14), "Should print number");
    }

    @DisplayName("5. Multiple Times")
    @Test
    @Order(4)
    void testForMultiplesTimes(){
        String[][] values = {{"1", "1"},
                {"2", "2"},
                {"3", "Fizz"},
                {"4", "4"},
                {"5", "Buzz"},
                {"6", "Fizz"},
                {"15", "FizzBuzz"}
        };
        for(int i=0; i<=values.length-1; i++){
            String expected = values[i][1];
            assertEquals(expected, FizzBuzz.computer(Integer.parseInt(values[i][0])), "Should print result");
        }
    }

    @DisplayName("6. Parameterized Small Test from CSV")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(6)
    void testSmallParameterizedValues(int value, String expected){
        assertEquals(expected, FizzBuzz.computer(value), "Should print result");
    }

    @DisplayName("7. Parameterized Medium Test from CSV")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(7)
    void testMediumParameterizedValues(int value, String expected){
        assertEquals(expected, FizzBuzz.computer(value), "Should print result");
    }

    @DisplayName("8. Parameterized Large Test from CSV")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(8)
    void testLargeParameterizedValues(int value, String expected){
        assertEquals(expected, FizzBuzz.computer(value), "Should print result");
    }
}
