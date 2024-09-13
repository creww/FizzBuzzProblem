package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class FizzBuzzEngineTest {

    private final FizzBuzzEngine sut = new FizzBuzzEngine();

    @ParameterizedTest
    @MethodSource("fixtures")
    public void fizzBuzzTest(Fixture fixture) {

        // set up
        String expected = fixture.expected;

        // exercise
        String actual = sut.execute(fixture.value);

        // verify
        assertEquals(expected, actual);
    }

    public static class Fixture {
        int value;
        String expected;

        Fixture(int value, String expected) {
            this.value = value;
            this.expected = expected;
        }
    }

    public static List<Fixture> fixtures() {
        return List.of(
                new Fixture(1, "1"),
                new Fixture(2, "2"),
                new Fixture(3, "Fizz"),
                new Fixture(4, "4"),
                new Fixture(5, "Buzz"),
                new Fixture(6, "Fizz"),
                new Fixture(7, "7"),
                new Fixture(8, "8"),
                new Fixture(9, "Fizz"),
                new Fixture(10, "Buzz"),
                new Fixture(11, "11"),
                new Fixture(12, "Fizz"),
                new Fixture(13, "13"),
                new Fixture(14, "14"),
                new Fixture(15, "FizzBuzz")
                      );
    }
}