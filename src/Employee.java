public class Employee {
    int id;
    String name;
    int age;
    double salary;
    boolean gender;
    int fixedBugs;
    int defaultBugRate;

    Employee(int id, String name, int age, double salary,
             boolean gender, int fixedBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    void bonus(int fixedBugs, int defaultBugRate) {
        int bon = fixedBugs / defaultBugRate;
    }

    @Override
    public String toString() {

        return " id =  " + id + ", name = "+ name + ", age =  " + age + ", salary = "  + salary + ", gender = " + gender
                                        + ", fixed bugs = " + fixedBugs + ", default bug rate = " + defaultBugRate;
    }

}