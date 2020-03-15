import java.util.Scanner;

public class string_replacer 
{
  public static void main(String[] args) 
  {
    Scanner keyboard = new Scanner(System.in);
        
    System.out.print("Enter a word to be recursively replaced: ");
    String word = keyboard.nextLine();

    int start = 0;
    int charRplcd = 0;
    strRplc(word, start, charRplcd);
    
    keyboard.close();      
  }

  public static void strRplc(String str, int index, int lettersReplaced)
  {   
    int loc = index;
    int rplcd = lettersReplaced;
    String strMod = str;
      
    if (loc == (strMod.length()))  // Reached the end of the string
    {
      System.out.println("Result from recursive replacement: " + strMod + ". ");
      System.out.println("Number of characters replaced " + rplcd);
    }
    else if (loc < strMod.length())
    {
      if(strMod.charAt(loc) == 'a')
      {
        strMod = strMod.replace('a', 'e');
        rplcd++;
      }
      else if(strMod.charAt(loc) == 'e')
      {
        strMod = strMod.replace('e', 'i');
        rplcd++;
      }
      else if(strMod.charAt(loc) == 'i')
      {
        strMod = strMod.replace('i', 'o');
        rplcd++;
      }
      else if(strMod.charAt(loc) == 'o')
      {
        strMod = strMod.replace('o', 'u');
        rplcd++;
      }
      else if(strMod.charAt(loc) == 'u')
      {
        strMod = strMod.replace('u', 'a');
        rplcd++;
      }
      
      loc++;
      strRplc(strMod, loc, rplcd);
    }
  }

}


/*
3. String replacer
Write a recursive method that accepts a 
string as its argument and replaces 
the following characters.

a with e
e with i
i with o
o with u
u with a

The output should display the replaced      
string and total number of replacements. 

For example:

Hello would be Hillu 
Number of characters replaced 2

for loop run multiple times implementing one replace at a time.
for loop move letter by letter implementing all changes.
*/
