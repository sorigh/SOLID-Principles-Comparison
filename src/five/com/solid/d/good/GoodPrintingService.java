package five.com.solid.d.good;

import four.com.solid.i.Invoice;

public class GoodPrintingService{
    private InvoicePrinter_I printer;
    public GoodPrintingService(InvoicePrinter_I printer) {
        this.printer = printer;
    }

    public void print(Invoice invoice) {
        printer.print(invoice);
    }

}
