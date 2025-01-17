package org.elhg.tdd;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            System.out.println(i+ ", "+FizzBuzz.computer(i));
        }

    }
}
