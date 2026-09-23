package hexlet.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmployeeTest {
    @Test
    public void testEmployee() {
        var employee = new Employee("John Doe", "SRE");

        assertNull(employee.getDepartment());
        assertEquals("John Doe", employee.getFullName());
        assertEquals("SRE", employee.getPosition());

        var department = new Department("it");
        department.addEmployee(employee);

        assertEquals(department, employee.getDepartment());
        assertEquals("it", employee.getDepartment().getTitle());

        department.removeEmployee(employee);
        assertNull(employee.getDepartment());
    }
}
