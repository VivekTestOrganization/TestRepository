package com.vivek;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a, int b) {
        return a + b ;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if(b==0)
        {
            throw new ArithmeticException("Divide by zero not allowed");
        }

        return a/b;
    }
    
    public int multiply(int a, int b) {
        return a*b;
    }

    public void toCreateAConflict(){
        system.out.printLn("Conflict Created !!! ");
    }
    
}
