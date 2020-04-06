public class Employee
{
    String empID;
    String empName;

    public Employee(String empIDparam, String empNameParam)
    {
        empID = empIDparam;
        empName = empNameParam;
    }

    public String getEmpID()
    {
        return empID;
    }

    public String getEmpName()
    {
        return empName;
    }

    public String toString()
    {
        return "Employee ID: "+ empID +
                "\nEmployee Name: " + empName;
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
