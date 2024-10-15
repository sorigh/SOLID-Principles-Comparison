package one.com.solid.s.good;

public class EmployeeAdditionalPaymentService {

    public double calculateAdditionalPay(GoodEmployee employee) {
        //calculates bonus
        if (employee.getStatus().equals("1"))
            return 100.0; //eg : employees with this status get a bonus
        else
            return 0;
    }
}
