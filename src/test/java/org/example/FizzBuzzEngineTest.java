package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class FizzBuzzEngineTest {

    private final FizzBuzzEngine sut = new FizzBuzzEngine(
            List.of(
                    new FizzBuzzRuleReusabilityOrientedVersion(3, "Fizz"),
                    new FizzBuzzRuleReusabilityOrientedVersion(5, "Buzz"),
                    new FizzBuzzRuleReusabilityOrientedVersion(7, "Foo"),
                    new FizzBuzzRuleReusabilityOrientedVersion(11, "Bar")
                   )
    );

//    private final FizzBuzzEngine sut = new FizzBuzzEngine(
//            List.of(
//                    new FizzBuzzRuleReadabilityOrientedVersionOfFizz(),
//                    new FizzBuzzRuleReadabilityOrientedVersionOfBuzz(),
//                    new FizzBuzzRuleReadabilityOrientedVersionOfFoo(),
//                    new FizzBuzzRuleReadabilityOrientedVersionOfBar()
//                   )
//    );

    @ParameterizedTest
    @MethodSource("fixturesOfFizzBuzzFooBar")
    public void fizzBuzzFooBarTest(Fixture fixture) {

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

    public static List<Fixture> fixturesOfFizzBuzzFooBar() {
        return List.of(
                new Fixture(1, "1"),
                new Fixture(2, "2"),
                new Fixture(3, "Fizz"),
                new Fixture(4, "4"),
                new Fixture(5, "Buzz"),
                new Fixture(6, "Fizz"),
                new Fixture(7, "Foo"),
                new Fixture(8, "8"),
                new Fixture(9, "Fizz"),
                new Fixture(10, "Buzz"),
                new Fixture(11, "Bar"),
                new Fixture(12, "Fizz"),
                new Fixture(13, "13"),
                new Fixture(14, "Foo"),
                new Fixture(15, "FizzBuzz"),
                new Fixture(16, "16"),
                new Fixture(17, "17"),
                new Fixture(18, "Fizz"),
                new Fixture(19, "19"),
                new Fixture(20, "Buzz"),
                new Fixture(21, "FizzFoo"),
                new Fixture(22, "Bar"),
                new Fixture(23, "23"),
                new Fixture(24, "Fizz"),
                new Fixture(25, "Buzz"),
                new Fixture(26, "26"),
                new Fixture(27, "Fizz"),
                new Fixture(28, "Foo"),
                new Fixture(29, "29"),
                new Fixture(30, "FizzBuzz"),
                new Fixture(31, "31"),
                new Fixture(32, "32"),
                new Fixture(33, "FizzBar")
                      );
    }
}