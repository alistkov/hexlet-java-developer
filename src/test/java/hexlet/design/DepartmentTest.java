package hexlet.design;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DepartmentTest {
    @Test
    public void testDepartment() {
        var department = new Department("it");

        assertEquals("it", department.getTitle());
        assertEquals(0, department.getEmployees().size());

        var employee = new Employee("John Doe", "SRE");

        department.addEmployee(employee);
        assertEquals(1, department.getEmployees().size());

        department.removeEmployee(employee);
        assertEquals(0, department.getEmployees().size());
    }
}
