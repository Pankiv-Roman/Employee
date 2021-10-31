import java.util.Random;

public class EmployeeFactory {



    public Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++){
            Employee employee = new Employee(
                    i,
                    "Employee" + i,
                    18 + (int) (Math.random() * 100),
                    6000.00 +  (Math.random() * size),
                    i % 2 == 0,
                    (int) (Math.random() * size),
                    (int) (Math.random() * 10)
                    );
            employees[i] = employee;
        }
        return employees;
    }
}
