import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = sc.nextLine();   // nextLine() finction is used for taking string as a input

        System.out.print("Enter age : ");
        int age = sc.nextInt();   // nextInt() Function is used to take intger input
        sc.close();   // V. V. Important

        System.out.println("Name is : "+ name + " Age is : " + age);

    }
}


// Note 
/*
 *      Method      	Description
    nextBoolean()   	Reads a boolean value from the user
    nextByte()	        Reads a byte value from the user
    nextDouble()    	Reads a double value from the user
    nextFloat()	        Reads a float value from the user
    nextInt()	        Reads a int value from the user
    nextLine()	        Reads a String value from the user
    nextLong()	        Reads a long value from the user
    nextShort()     	Reads a short value from the user
 * 
 * Note: If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "InputMismatchException").
 * it is always recommended to close the sc object after taking last input
 */