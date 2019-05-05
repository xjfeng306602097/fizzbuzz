package com.xjf;

import org.junit.Test;

public class FizzBuzzTestCase {

    @Test
    public void testFizzBuzz() {
        int i = 0;
        while (++i <= 100) {
            System.out.println((i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : i);
        }
    }

}
