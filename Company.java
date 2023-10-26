import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {

    private Set<Employee> allEmployees;

    public Company(Set<Employee> allEmployees) {
        this.allEmployees = allEmployees;
        allEmployees = new HashSet<>();
    }

    public void addEmployee(Employee emp, int salary) {
        emp.setSalary(salary);
        allEmployees.add(emp);
    }


    public Employee findLeastBusy(int depId) {
        List<Employee> newList = new ArrayList<>();
        Employee marek = new Employee("marek", 0, 0);
        newList.add(marek);
        for (Employee employee : allEmployees) {
            if (employee.getDepartmentId() == depId) {
                newList.add(employee);
                for (Employee x : newList) {
                    Employee index = newList.get(newList.indexOf(x) - 1);
                    if (x.getAssignedTasksNum() < index.getAssignedTasksNum()) {
                        newList.add(x);

                    }


                }
            }
        }
        return newList.get(0);
    }

    public void assignTask(String task, int depId) {
        List<Employee> newList = new ArrayList<>();
        Employee marek = new Employee("marek", 0, 0);
        newList.add(marek);
        for (Employee employee : allEmployees) {
            if (employee.getDepartmentId() == depId) {
                newList.add(employee);
                for (Employee x : newList) {
                    Employee index = newList.get(newList.indexOf(x) - 1);
                    if (x.getAssignedTasksNum() < index.getAssignedTasksNum()) {
                        x.addTask(task);
                    }
                }


            }
        }
    }
    public void raiseSalary(int percentage){

    }
}
