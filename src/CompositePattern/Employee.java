package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/18 19:10
 * @Description TODO
 **/
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        this.subordinates.add(employee);
    }

    public void remove(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
