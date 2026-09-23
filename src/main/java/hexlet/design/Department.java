package hexlet.design;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Department {
    @Setter private String title;

    @Getter private final List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employee.setDepartment(this);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employee.setDepartment(null);
        employees.remove(employee);
    }
}
