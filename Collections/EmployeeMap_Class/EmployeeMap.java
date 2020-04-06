import java.util.HashMap;
import java.util.Map;

public class EmployeeMap 
{
    Map<String, Employee> empMap;

    public EmployeeMap()
    {
        empMap = new HashMap<String,Employee>();
    }
    
    public void add(Employee e)
    {
        empMap.put(e.getEmpID(), e);
    }

    public Employee get(String empIDparam)
    {
        return empMap.get(empIDparam);
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
