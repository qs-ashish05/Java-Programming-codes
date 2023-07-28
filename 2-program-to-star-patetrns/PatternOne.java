/*
 Pattern One is : 
    *
    * *
    * * * 
    * * * * 
    * * * * * 
 */

public class PatternOne {

    public static void main(String[] args) {

        System.out.println("Pattern - 01");
        //For Actual pattern 
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /* In the above code the values of i and j will follow the following ordee
            i   j
            1   1  (In first line only one *)
            2   2  (In Secondt line two *) 
            3   3  (In third line three one *)
         */
        System.out.println("Pattern - 02");
        System.out.println("The same pattern in reverse order is as follows \n");
        //To reverse the given pattern
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
         /* In the above code the values of i and j will follow the following ordee
            i   j
            1   4  (In first line four *)
            2   3  (In Secondt line three *) 
            3   2  (In third line two one *)
         */

         // Another pattern (cmobination of both the above codes)
            System.out.println("Pattern - 03");
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=1;i<=4;i++){
                for(int j=4;j>=i; j--){
                    System.out.print("*");
                }
                System.out.println("");
            }


            // Note : The above  program will print the 4 * pattern 2 times and hence we need to do smal modifiaction in the code as
         // Another pattern (cmobination of both the above codes)
            System.out.println("Pattern - 03");
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=1;i<=4;i++){
                for(int j=3;j>=i; j--){        // change need to be done here
                    System.out.print("*");
                }
                System.out.println("");
            }

    }
    
}


/*
 * Logic :
 *  Divides the Problem in the form of rows and columns 
 * 
 */
