import java.util.ArrayList;
import java.util.Scanner;

public class myList_Mod 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        MyList<Integer> demoListInt = new MyList<Integer>();
        System.out.println("demoListInt object created.");

        System.out.print("Enter the first of three Integers: ");
        Integer int1 = keyboard.nextInt();
        demoListInt.add(int1);

        System.out.print("Enter the second of three Integers: ");
        Integer int2 = keyboard.nextInt();
        demoListInt.add(int2);

        System.out.print("Enter the third of three Integers: ");
        Integer int3 = keyboard.nextInt();
        demoListInt.add(int3);
        
        //consume the remaining newline.
        keyboard.nextLine();

        MyList<String> demoListString = new MyList<String>();
        System.out.println("\ndemoListString object created.");

        System.out.print("Enter the first of three Strings: ");
        String str1 = keyboard.nextLine();
        demoListString.add(str1);

        System.out.print("Enter the second of three Strings: ");
        String str2 = keyboard.nextLine();
        demoListString.add(str2);

        System.out.print("Enter the third of three Strings: ");
        String str3 = keyboard.nextLine();
        demoListString.add(str3);

        System.out.println("largest element of demoListInt object: " + demoListInt.largest());
        System.out.println("smallest element of demoListInt object: " + demoListInt.smallest());


        System.out.println("largest element of demoListString : " + demoListString.largest());
        System.out.println("smallest element of demoListString : " + demoListString.smallest());
        keyboard.close();
    }
    
}

class MyList<T extends Comparable<T>>
{
    ArrayList<T> arrayList;

    MyList()
    {
        arrayList = new ArrayList<T>();
    }

    /* MyList(T al)
    {
        ArrayList<T> arrayList = new ArrayList<T>();
    } */

    public void add(T gcObjToAdd)
    {
        arrayList.add(gcObjToAdd);
    }

    public T largest()
    {   
        T largestGCObj;
        largestGCObj = arrayList.get(0);

        for(int i = 1; i < arrayList.size(); i++)
        {   
            T indexElement = arrayList.get(i);
            if(indexElement.compareTo(largestGCObj) > 0)
            {
                largestGCObj = indexElement;
            }
        }
        

        return largestGCObj; 
    }

    public T smallest()
    {   
        T smallestGCObj;
        smallestGCObj = arrayList.get(0);

        for(int i = 1; i <arrayList.size(); i++)
        {
            T indexElement = arrayList.get(i);
            if(indexElement.compareTo(smallestGCObj) < 0)
            {
                smallestGCObj = indexElement;
            }
        }

        return smallestGCObj; 
    }


}


/*
2) Modify the MyList class that you wrote for Programming challenge 1(above) 
so the type parameter T should accept any type that implements the Comparable 
interface. 
Test the class in a program that creates one instance of MyList 
to store Integers, and another instance to store Strings.
*/


/*
1) Write a generic class named MyList, with a type parameter T. 
The type parameter T should be constrained to an upper bound: the Number class. 
The class should have as a field an ArrayList of T. 
Write a public method named add, which accepts a parameter of type T. 
When an argument is passed to the method, it is added to the ArrayList. 
Write two other methods, largest and smallest, which return 
the largest and smallest values in the ArrayList.
*/
