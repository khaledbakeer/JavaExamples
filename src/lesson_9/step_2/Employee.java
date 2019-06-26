package lesson_9.step_2;

public abstract class Employee {
    String name;
    int telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public abstract int getCountsOfEmployees();

    public abstract void print(String space);
}
