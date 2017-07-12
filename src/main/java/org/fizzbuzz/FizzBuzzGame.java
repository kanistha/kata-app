package org.fizzbuzz;

public class FizzBuzzGame {

    public String printLine(int maxNumber) {
            String result = "";
        for (int i = 1; i <= maxNumber; i++) {
            result+= getPrintString(i)+" ";
        }

        String[] resultArray = result.split(" ");
        for (String s : resultArray) {
            System.out.println(s);
        }
        return result;

    }

    public String getPrintString(int number) {
        if((number % 3 == 0) && (number % 5 ==0)) {
            return "fizzBuzz";
        }
        if(number % 3 == 0){
            return "fizz";
        }
        if(number % 5 == 0){
            return "buzz";
        }
        return number+"";
    }
}
