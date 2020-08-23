import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    Employee emp1 = new Employee("Mike",1000);
    Employee emp2 = new Employee("Steve", 2000);
    Employee emp3 = new Employee("John", 3000);

    List<Employee> employees;

    public List<Employee> generateEmployees(){
         employees = new ArrayList<>();

         employees.add(emp1);
         employees.add(emp2);
         employees.add(emp3);

         return employees;
    }

    public void addEmpluyee(Employee emp){
        employees.add(emp);
    }

}
