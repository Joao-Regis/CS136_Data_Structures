import java.util.Scanner;

public class highest_and_lowest_demo
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("high_and_low_object created.");

        System.out.print("Enter the first of three Integers: ");
        Integer int1 = keyboard.nextInt();
        //arrayOfIntegers[0].add(int1);

        System.out.print("Enter the second of three Integers: ");
        Integer int2 = keyboard.nextInt();
        //demoListInt.add(int2);

        System.out.print("Enter the third of three Integers: ");
        Integer int3 = keyboard.nextInt();
        //demoListInt.add(int3);
        
        //consume the remaining newline.
        keyboard.nextLine();


        Integer[] arrayOfIntegers = {int1, int2, int3};

        highest_lowest_generic_class<Integer> high_and_low_object = 
                    new highest_lowest_generic_class<>(arrayOfIntegers);

    
        System.out.println("highest value: " + high_and_low_object.highest());
        System.out.println("lowest value: " + high_and_low_object.lowest());
        
        keyboard.close();

    }

   
}



/*
6. Highest and Lowest Elements
Write a generic class with a type parameter constrained to 
any type that implements Comparable. The constructor should accept 
an array of such objects. The class should have methods that return 
the highest and lowest values in the array. Demonstrate the class 
in an application.
*/
