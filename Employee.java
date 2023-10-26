import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Employee  {

    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;

    private int totalProcessed;


    public Employee(String name, int departmentId, int salary) {
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
        assignedTasks = new ArrayList<>();


    }


    public void processTask(int index) {

        if (!assignedTasks.isEmpty()) {
            System.out.println("processing task " + assignedTasks.get(index));
            assignedTasks.remove(index);
            totalProcessed ++;
        }else{
            System.out.println("no tasks to process");
        }
    }
    public void addTask(String newTask){
        int endOfTheList = assignedTasks.size() -1;
        assignedTasks.add(endOfTheList,newTask);
    }



    public int getAssignedTasksNum(){
        return assignedTasks.size();
    }

    public int getTotalProcessed() {
        return totalProcessed;
    }

    public void setTotalProcessed(int totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }
}
