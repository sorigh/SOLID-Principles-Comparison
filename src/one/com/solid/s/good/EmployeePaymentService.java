package one.com.solid.s.good;

public class EmployeePaymentService {
    EmployeeAdditionalPaymentService additionalPaymentService;
    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService){
        this.additionalPaymentService = additionalPaymentService;
    }
    public void calculatePay(GoodEmployee employee) {
        //salary based on worked hours
        double basePay = employee.getHours() * 20;
        double additionalPay = additionalPaymentService.calculateAdditionalPay(employee);
        double totalPay = basePay + additionalPay;
        System.out.println("Salary for " + employee.getName() + "is: " + totalPay + "$");
    }
}
