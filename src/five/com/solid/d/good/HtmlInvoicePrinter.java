package five.com.solid.d.good;

import four.com.solid.i.Invoice;

public class HtmlInvoicePrinter implements InvoicePrinter_I {
    @Override
    public void print(Invoice invoice) {
        System.out.println("<html><body><h1>Invoice ID: " + invoice.toString() + "</h1></body></html>");
    }
}
