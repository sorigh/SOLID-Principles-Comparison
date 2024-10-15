package one.com.solid.s.good;

public class EmployeeRepository {
    public void save(GoodEmployee employee) {
        //access the db
        System.out.println("Saving data for " + employee.getName());
    }
}
