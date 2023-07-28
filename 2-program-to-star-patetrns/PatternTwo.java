public class PatternTwo {
    public static void main(String[] args) {

        System.out.println("Pattern - 01");
        /*Problem - 01 */
        /*
                *
               **
              ***
             ****
            ***** 
         */

        // same as program in file PatternOne.java 

        for (int i = 0; i <= 5; i++) {
            
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=  i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println();
        System.out.println("Pattern - 02");
        /*Problem - 02*/
        /*
            *****
             ****
              ***
               **
                *
         */

        // same as program in file PatternOne.java 
        for (int i = 1; i <= 5; i++) {
            // for loop to print sapca
            for (int j = 2; j <= i; j++) {         // change the value to j = 1 and observe the difference
                System.out.print(" ");  
            }

            // for loop to print the star
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println("");      // move to the next line
        }

    }
}


// outer for loop is always for number of lines and mostly it is constant 

