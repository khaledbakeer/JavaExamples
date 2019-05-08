package lesson_4.abstractClass.simpleExample;

public class ExampleRunner {
    /*
    Run Example:
    ------------
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Max", Human.gender.Male, "", 0, 190, Human.color.blue);

        System.out.println(employee);

        employee.getAge();
        employee.getEyesColor();
        employee.getTall();
        employee.getWork();


        System.out.println();
        System.out.println("Name Changed: ");
        employee.changeName("Mikey");
        System.out.println(employee);


        /*
        Output:
        -------
        Name: Max, Gender: Male
        you did not set any age for this human
        this human's eye color is "blue"
        this human's tall is "190.0"
        you did not set any work for this human

        Name Changed:
        Name: Mikey, Gender: Male
         */
    }
}
