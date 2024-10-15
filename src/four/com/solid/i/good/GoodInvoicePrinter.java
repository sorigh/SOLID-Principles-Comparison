package four.com.solid.i.good;

import four.com.solid.i.ComplexInvoice;
import four.com.solid.i.Invoice;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I {
    @Override
    public void print(Invoice invoice) {
        System.out.println("Simply printing " + invoice);
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing but it's complex" + complexInvoice);
    }
}
