public class Test {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        System.out.println(employeeService.getByName("Employee2"));

        System.out.println("");

        Employee[] employees = employeeService.sortByName();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


        System.out.println("");

        Employee[] employees1 = employeeService.sortByNameAndSalary();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees1[i]);
        }

        System.out.println("");

        System.out.println(employeeService.remove(2));

        System.out.println("");

        Employee e1 = employeeService.getById(1);
        System.out.println(e1);

        e1.name = "123";
        System.out.println(employeeService.edit(e1));

    }

}
