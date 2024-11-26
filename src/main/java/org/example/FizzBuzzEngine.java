package org.example;

public class FizzBuzzEngine {

    public String execute(int value) {

        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append("Fizz");
        }
        if (value % 5 == 0) {
            sb.append("Buzz");
        }

        return sb.isEmpty() ? String.valueOf(value) : sb.toString();
    }
}
