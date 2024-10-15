package one.com.solid.s.good;

public class EmployeeTimetrackingService {
    public void reportHours(GoodEmployee employee) {
        //access and send out worked hours for employees.
        System.out.println(employee.getName() + " worked " + employee.getHours() + " hours this week.");
    }
}
