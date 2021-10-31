import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {
    Employee[] employees;

   static class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    static class NameAndSalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            int ret = o1.name.compareTo(o2.name);
            if (ret == 0) {
                ret = Double.compare(o1.salary, o2.salary);
            }
            return ret;
        }
    }


    public EmployeeService() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        this.employees = employeeFactory.generateEmployees(5);

    }

    public Employee getById(int id) {
        return employees[id];
    }

    public Employee getByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].name.equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] sortByName() {
        Employee[] employeesCopy = Arrays.copyOf(employees, employees.length);
        Arrays.sort(employeesCopy, new NameComparator());
        return employeesCopy;
    }

    public Employee[] sortByNameAndSalary() {
        Employee[] employeesCopyAndSalary = Arrays.copyOf(employees, employees.length);
        Arrays.sort(employeesCopyAndSalary, new NameAndSalaryComparator());
        return employeesCopyAndSalary;
    }

    public Employee edit(Employee employee) {
        Employee e = employees[employee.id];
        Employee oldE = new Employee(e.id, e.name, e.age, e.salary, e.gender, e.fixedBugs, e.defaultBugRate);
        Employee newE = new Employee(employee.id, employee.name, employee.age, employee.salary, employee.gender, employee.fixedBugs, employee.defaultBugRate);
        employees[employee.id] = newE;
        return oldE;
    }

    public Employee remove(int id) {
        employees[id] = null;
        return employees[id];
    }



}