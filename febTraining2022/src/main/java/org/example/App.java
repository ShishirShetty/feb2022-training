package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Data types
        //Primitives and Classes

/*        byte short int long | float double | boolean char i;
        char c = 'A';


        String s = "dhdfjsjlfjskflsdklfjsklj3878973948593753(&**(^*(^(^(*";*/
        //Constructs
/*
        char c = 'A';
        boolean isA = (c == 'A');
        boolean isB = (c == 'B');
        if (isA) {
            System.out.println("I am A");
        } else if (isB) {
            System.out.println("I am B");
        } else {
            System.out.println("I am neither A nor B");
        }
*/
        int[] numbers = {100, 780, 343, 1, 89, 67};
        /////// some code here 100 lines
        numbers = new int[]{};
        System.gc();
 /*       int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
        } while (i <= 10);
  */  }

    private static void someOtherMethod(int[] numbers) {
       int[] numbers2 = numbers;
        someOtherMethod2(numbers2);
    }

    private static void someOtherMethod2(int[] numbers2) {
        int[] numbers3 = {101};
        numbers2 = numbers3;
        // numbers2[0] = 101;
    }
}


