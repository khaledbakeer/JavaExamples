package lesson_9.step_1;

import java.util.ArrayList;
import java.util.List;

public class HeadOfDepartment {

    List<Employee> employees = new ArrayList<>();

    String name;
    int telephone;
    String department;

    public HeadOfDepartment(String name, int telephone, String department) {
        this.name = name;
        this.telephone = telephone;
        this.department = department;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCountsOfEmployees() {
        return employees.size();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void remove(Employee e) {
        employees.remove(e);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    @Override
    public String toString() {
        return "HeadOfDepartment{" +
                "employees=" + employees +
                ", name='" + name + '\'' +
                ", telephone=" + telephone +
                ", department='" + department + '\'' +
                '}';
    }
}
