package com.vivek;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by vd00738 on 6/18/14.
 */
public class FizzBuzzTest extends TestCase {

    FizzBuzz fizzBuzz;

    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FizzBuzzTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(FizzBuzzTest.class);
    }

    public void testTranslateGivenOneReturnsOne() throws Exception {
        assertEquals("1", fizzBuzz.translate(1));
    }

    public void testTranslateGivenTwoReturnsTrue() throws Exception {
        assertEquals("2", fizzBuzz.translate(2));
    }

    public void testTranslateGivenThreeReturnsFizz() throws Exception {
        assertEquals("Fizz", fizzBuzz.translate(3));
    }

    public void testTranslateGivenFiveReturnsBuzz() throws Exception {
        assertEquals("Buzz", fizzBuzz.translate(5));
    }

    public void testTranslateGivenSixReturnsFizz() throws Exception {
        assertEquals("Fizz", fizzBuzz.translate(6));
    }

    public void testTranslateGivenFifteenRetrunsFizzBuzz() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.translate(15));
    }
}
