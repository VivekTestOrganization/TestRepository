package com.vivek;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    private App app;

    public void setUp(){
        app = new App();
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppAdd()
    {
        int a = 2;
        int b = 3;
        int c = app.add(a,b);
        assertTrue( c == (a+b) );
    }

    public void testAppMinus()
    {
        int a = 3;
        int b = 2;
        int c = app.minus(a, b);
        assertTrue( c == (a-b) );
    }
    public void testAppDiv()
    {
        int a = 10;
        int b = 5;
        int c = app.div(a,b);
        assertTrue( c == (a/b) );
    } 

    public void testAppMultiply()
    {

        //Test
        int a = 3;
        int b = 2;
        int c = app.multiply(a, b);
        assertTrue( c == (a*b) );
    }
}
