package lesson_9.step_2;

import java.util.ArrayList;
import java.util.List;

public class HeadOfDepartment extends Employee {
    String department;
    List<Employee> employees = new ArrayList<>();

    public HeadOfDepartment(String name, String department, int telephone) {
        this.name = name;
        this.telephone = telephone;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
    public int getCountsOfEmployees() {
        int sum = 1;
        for (Employee e : employees) {
            sum = sum + e.getCountsOfEmployees();
        }
        return sum;
    }

    @Override
    public void print(String space) {
        System.out.println(space + "Head of Department " + getName() + " (" + getDepartment() + "). Tel: " + getTelephone());
        for (Employee e : employees) {
            e.print(space + "       ");
        }
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
