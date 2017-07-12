package org.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzGameTest {

    private FizzBuzzGame fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzzGame();
    }

    @Test
    public void testMultiplesOfFiveOnlyReturnsBuzz() throws Exception {
        assertThat((fizzBuzz.getPrintString(5))).isEqualTo("buzz");
    }

    @Test
    public void testMultiplesOfThreeOnlyReturnsFizz() throws Exception {
        assertThat(fizzBuzz.getPrintString(3)).isEqualTo("fizz");
        assertThat(fizzBuzz.getPrintString(9)).isEqualTo("fizz");
        assertThat(fizzBuzz.getPrintString(33)).isEqualTo("fizz");
        assertThat(fizzBuzz.getPrintString(396)).isEqualTo("fizz");
    }

    @Test
    public void testMultiplesOfFiveAndThreeReturnsFizzBuzz() throws Exception {
        assertThat(fizzBuzz.getPrintString(30)).isEqualTo("fizzBuzz");
        assertThat(fizzBuzz.getPrintString(60)).isEqualTo("fizzBuzz");
        assertThat(fizzBuzz.getPrintString(90)).isEqualTo("fizzBuzz");
    }

    @Test
    public void testOthersReturnsSameNumber() throws Exception {
        assertThat(fizzBuzz.getPrintString(1)).isEqualTo("1");
    }

    @Test
    public void testPrintLinePrintsTillGivenNumber() throws Exception {
        assertThat(fizzBuzz.printLine(5)).isEqualTo("1 2 fizz 4 buzz ");

    }
}
