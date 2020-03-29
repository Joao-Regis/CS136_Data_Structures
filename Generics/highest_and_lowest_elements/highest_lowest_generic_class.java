public class highest_lowest_generic_class<T extends Comparable<T>>
{
    T[] hgh_lw_Array;

    public highest_lowest_generic_class(T[] arrayofTobjects) 
    {
        
    }


    public T highest()
    {
        return highestValObj;
    }

    public T lowest()
    {
        return lowestValObj;
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
