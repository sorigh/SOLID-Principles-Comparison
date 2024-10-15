package four.com.solid.i.good;

import four.com.solid.i.ComplexInvoice;
import four.com.solid.i.Invoice;

public interface GoodInvoicePrinter_I {
    void print(Invoice invoice);

    void printComplexInvoice(ComplexInvoice complexInvoice);
}
