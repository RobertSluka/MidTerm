import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("marek",0,0);
        Set<Employee> set = new HashSet<>();
        set.add(employee);
        System.out.println(employee.getName());
        Company company = new Company(set);
        company.addEmployee(employee,10);
    }
}
