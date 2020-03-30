public class highest_lowest_generic_class<T extends Comparable<T>>
{
    T[] hgh_lw_Array;

    public highest_lowest_generic_class(T[] arrayofTobjects) 
    {
        hgh_lw_Array = arrayofTobjects;
    }


    public T highest()
    {
        T highestGenericClassObj;
        highestGenericClassObj = hgh_lw_Array[0];

        for(int i = 1; i < hgh_lw_Array.length; i++)
        {
            if(hgh_lw_Array[i].compareTo(highestGenericClassObj) > 0)
            {
                highestGenericClassObj = hgh_lw_Array[i];
            }
        }

        return highestGenericClassObj;
    }

    public T lowest()
    {
        T lowestGenericClassObj;
        lowestGenericClassObj = hgh_lw_Array[0];

        for(int i = 1; i < hgh_lw_Array.length; i++)
        {
            if(hgh_lw_Array[i].compareTo(lowestGenericClassObj) < 0)
            {
                lowestGenericClassObj = hgh_lw_Array[i];
            }
        }

        return lowestGenericClassObj;
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
