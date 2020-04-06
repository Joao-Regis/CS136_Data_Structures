import java.util.Scanner;

public class EmployeeMapTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        EmployeeMap emap = new EmployeeMap();

        System.out.println("Enter an employee 1 ID number and Employee 1 name: ");
        System.out.print("Employee 1 ID number: ");
        String empIDnum1 = keyboard.nextLine();
        System.out.print("Employee 1 name: ");
        String empIDname1 = keyboard.nextLine();
        Employee emp1 = new Employee(empIDnum1, empIDname1);

        System.out.println("Enter an employee 2 ID number and Employee 2 name: ");
        System.out.print("Employee 2 ID number: ");
        String empIDnum2 = keyboard.nextLine();
        System.out.print("Employee 2 name: ");
        String empIDname2 = keyboard.nextLine();
        Employee emp2 = new Employee(empIDnum2, empIDname2);

        System.out.println("Enter an employee 3 ID number and Employee 3 name: ");
        System.out.print("Employee 3 ID number: ");
        String empIDnum3 = keyboard.nextLine();
        System.out.print("Employee 3 name: ");
        String empIDname3 = keyboard.nextLine();
        Employee emp3 = new Employee(empIDnum3, empIDname3);

        Employee[] employeeArray = {emp1, emp2, emp3};

        emap.add(employeeArray[0]);
        emap.add(employeeArray[1]);
        emap.add(employeeArray[2]);

        Employee foundEmployee = emap.get(emp1.getEmpID());

        if(foundEmployee != null)
        {
            System.out.println(foundEmployee);
        }
        else
        {
            System.out.println("That emplyee ID was not found in the set.");
        }


        foundEmployee = emap.get("911C87");
        if(foundEmployee != null)
        {
            System.out.println(foundEmployee);
        }
        else
        {
            System.out.println("That emplyee ID was not found in the set.");
        }


        keyboard.close();
    }
}



/*
3) EmployeeMap Class
Create an Employee Class that stores an Employees ID number 
and name. 
Then create an EmployeeMap class that allows you to 
add Employee objects and look them up by their ID numbers. 
The EmployeeMap class should use Map object to map ID numbers 
to Employee objects. 
Create an application to demonstrate the classes.
*/
