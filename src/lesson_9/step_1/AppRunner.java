package lesson_9.step_1;

public class AppRunner {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Max", 111);
        Employee emp2 = new Employee("Anton", 112);
        Employee emp3 = new Employee("Riki", 113);
        HeadOfDepartment manager = new HeadOfDepartment("manager", 123, "Managing");

        // add three employees to the company XY
        manager.add(emp1);
        manager.add(emp2);
        manager.add(emp3);

        // remove emp2 from the list of employees
        manager.remove(emp2);

        // print
        System.out.println(manager.employees);


    }

}
