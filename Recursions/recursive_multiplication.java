import java.util.Scanner;

public class recursive_multiplication 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter first value to multiply by ");
        int first = keyboard.nextInt();

        System.out.print("Enter second value to multiply by ");
        int second = keyboard.nextInt();

        
        System.out.println("product of " + first + " * " + 
                        second + " = " + rm(first, second));
        
        keyboard.close();
    }

    private static int rm(int x, int y)
    {
        
        if(x == 0)
        {
            return 0;
        }
        else
        {
            return (y + rm(x - 1, y));
        }
        
    }
}
