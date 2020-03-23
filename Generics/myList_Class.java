import java.util.ArrayList;
import java.util.Scanner;

public class myList_Class 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        MyList<Integer> demoList = new MyList<Integer>();
        //MyList<Integer> demoList = new MyList<Integer>(al);

        System.out.print("Enter the first of three numbers: ");
        Integer int1 = keyboard.nextInt();
        demoList.add(int1);

        System.out.print("Enter the second of three numbers: ");
        Integer int2 = keyboard.nextInt();
        demoList.add(int2);

        System.out.print("Enter the third of three numbers: ");
        Integer int3 = keyboard.nextInt();
        demoList.add(int3);
        
        System.out.println("demoList elements: " + demoList.arrayList);
        
        System.out.println("largest element: " + demoList.largest());

        System.out.println("smallest element: " + demoList.smallest());

        keyboard.close();
    }
    
}

class MyList<T extends Number>
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
            if(indexElement.doubleValue() > largestGCObj.doubleValue())
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
            if(indexElement.doubleValue() < smallestGCObj.doubleValue())
            {
                smallestGCObj = indexElement;
            }
        }

        return smallestGCObj; 
    }


}

/*
1) Write a generic class named MyList, with a type parameter T. 
The type parameter T should be constrained to an upper bound: the Number class. 
The class should have as a field an ArrayList of T. 
Write a public method named add, which accepts a parameter of type T. 
When an argument is passed to the method, it is added to the ArrayList. 
Write two other methods, largest and smallest, which return 
the largest and smallest values in the ArrayList.
*/
