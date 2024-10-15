package four.com.solid.i.bad;

import four.com.solid.i.ComplexInvoice;
import four.com.solid.i.Invoice;

public interface BadInvoicePrinter_I {

	void print(Invoice invoice);
	
	void printComplexInvoice(ComplexInvoice complexInvoice);
	
	void someOtherPrintMethod(Invoice invoice);
	
}
