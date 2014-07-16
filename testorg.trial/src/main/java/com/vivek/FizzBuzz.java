package com.vivek;

public class FizzBuzz {

    private final String fizz = "Fizz";
    private final String buzz = "Buzz";

    public String translate(int numberToTranslate) {
        if (isMultipleOfThree(numberToTranslate) && isMultipleOfFive(numberToTranslate)) {
            return fizz + buzz;
        } else if (isMultipleOfThree(numberToTranslate)) {
            return fizz;
        } else if (isMultipleOfFive(numberToTranslate)) {
            return buzz;
        }
        return String.valueOf(numberToTranslate);
    }

    private boolean isMultipleOfFive(int numberToTranslate) {
        return numberToTranslate % 5 == 0;
    }

    private boolean isMultipleOfThree(int numberToTranslate) {
        return numberToTranslate % 3 == 0;
    }


}
