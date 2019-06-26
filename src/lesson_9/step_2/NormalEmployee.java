package lesson_9.step_2;

public class NormalEmployee extends Employee {

    public NormalEmployee(String name, int telephon) {
        this.name = name;
        this.telephone = telephon;
    }

    @Override
    public int getCountsOfEmployees() {
        return 1;
    }

    @Override
    public void print(String space) {
        System.out.println(space + getName() + ". Tel: " + getTelephone());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", telephon=" + telephone +
                '}';
    }
}
