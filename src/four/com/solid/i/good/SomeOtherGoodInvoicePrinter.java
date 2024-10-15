package four.com.solid.i.good;

import four.com.solid.i.Invoice;

public class SomeOtherGoodInvoicePrinter implements SomeOtherGoodInvoicePrinter_I {
    @Override
    public void someOtherPrintMethod(Invoice invoice) {
        System.out.println("Only way of printing here: " + invoice);
    }
}
