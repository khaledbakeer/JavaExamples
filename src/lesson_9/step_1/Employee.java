package lesson_9.step_1;

public class Employee {

    String name;
    int telephon;

    public Employee(String name, int telephon) {
        this.name = name;
        this.telephon = telephon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephon() {
        return telephon;
    }

    public void setTelephon(int telephon) {
        this.telephon = telephon;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", telephon=" + telephon +
                '}';
    }
}
