import employee.Employee;
import org.junit.Test;
import org.junit.Assert;
public class EmployeeAppTest {

    @Test
    public void testData() {

        Employee testEmp = this.getEmployeeTest();
        Assert.assertEquals(testEmp.getEmpName(), "John");
        Assert.assertEquals(testEmp.getEmpEmail(), "john@baeldung.com");
        Assert.assertEquals(testEmp.getYearOfBirth(), 1978);

    }

    private Employee getEmployeeTest() {

        Employee employee = new Employee();
        employee.setEmpName("John");
        employee.setEmpEmail("john@baeldung.com");
        employee.setYearOfBirth(1978);

        return employee;
    }
}