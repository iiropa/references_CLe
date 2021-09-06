package com.company;

public class Main {

    public static void main(String[] args) {
        // from-to (for) loop

        /*
       int n = 4;
       int product = 1, counter = 1;
       while (counter <= n) {
           product = product * counter;
           counter++;
       }
        System.out.println("woow " + product);
    }
         */

        //anothe loop -------------------------------------------------------------
     /*
        int n = 11;
        int product = 1;
        for (int counter = 1; counter <= n; counter = counter + 1)
            product = product * counter;


        System.out.println("product " + product);
        System.out.println("counter " + counter);

//example 5 ------------------------------------------------------------

        {
            int largest = 0, smallest = 0;
            for (int n = 0; n <= 50; n = n + 1) {
                int value = n * (n - 30) * (n - 50);
                if (value > largest)
                    largest = value;
                if (value < smallest)
                    smallest = value;
            }
            System.out.println("largest: " + largest);
            System.out.println("smallest: " + smallest);

// example 6 --------------------------------------------

            final int S = 1000;
            boolean found = false;
            int n = 1;

            while (found == false) // while (!found) // while not found, same thing as found = false
            {
                int value = n * (n+1) / 2;
                if (value > S)
                    found = true;
                else
                    n = n + 1;
            }
            System.out.println(n);

//Homwéwork 2 ===========================================

            int weight = 4;
            int price = 0;

            if (weight <= 2) {
                price = 3;
            }
            if (weight > 2 && weight <= 5) {
                price = 3 + 2 * (weight - 2);
            }
            if (weight > 5) {
                price = 9 + 3 * (weight - 5);
            }
            System.out.println("The price is " + price);

//Loop flow chart ex.1 ==========================================

            int x = 2, y = 5;
            int result = 1;

            while (y>0) {
                if (y % 2 == 0) {
                    y  = y / 2;
                    x = x * x;
                }
                else
                {
                    y = y- 1;
                    result = result * x;
                    
      */
    }
}
