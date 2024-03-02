package employee;
public class EmployeeApp {

    public static void main(String[] args){
        Employee employee = new Employee();

        employee.setEmpName("John");
        employee.setEmpEmail("john@baeldung.com");
        employee.setYearOfBirth(1978);

        System.out.println("Name: " + employee.getEmpName());
        System.out.println("Email Address: " + employee.getEmpEmail());
        System.out.println("Year Of Birth:" + employee.getYearOfBirth());
    }
}