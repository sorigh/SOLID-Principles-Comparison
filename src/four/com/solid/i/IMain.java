package four.com.solid.i;

import four.com.solid.i.bad.BadInvoicePrinter;
import four.com.solid.i.bad.BadInvoicePrinter_I;
import four.com.solid.i.bad.SomeOtherBadInvoicePrinter;
import four.com.solid.i.good.GoodInvoicePrinter;
import four.com.solid.i.good.GoodInvoicePrinter_I;
import four.com.solid.i.good.SomeOtherGoodInvoicePrinter;
import four.com.solid.i.good.SomeOtherGoodInvoicePrinter_I;

import java.util.Date;

public class IMain {

	public static void main(String[] args) {
		testBadI();
		testGoodI();
	}

	private static void testBadI() {
		Invoice invoice = new Invoice(-132523);
		ComplexInvoice complexInvoice = new ComplexInvoice(21439, new Date());

		BadInvoicePrinter_I badInvoicePrinter = new BadInvoicePrinter();
		badInvoicePrinter.print(invoice);
		badInvoicePrinter.printComplexInvoice(complexInvoice);
		badInvoicePrinter.someOtherPrintMethod(invoice); //why should I be able to do this?
		
		BadInvoicePrinter_I someOtherBadInvoicePrinter = new SomeOtherBadInvoicePrinter();
		someOtherBadInvoicePrinter.print(invoice); //why should I be able to do this?
		someOtherBadInvoicePrinter.printComplexInvoice(complexInvoice); //why should I be able to do this?
		someOtherBadInvoicePrinter.someOtherPrintMethod(invoice);
	}

	private static void testGoodI() {
		Invoice invoice = new Invoice(423);
		ComplexInvoice complexInvoice = new ComplexInvoice(242, new Date());
		
		GoodInvoicePrinter_I goodInvoicePrinter = new GoodInvoicePrinter();
		goodInvoicePrinter.print(invoice);
		goodInvoicePrinter.printComplexInvoice(complexInvoice);
		// goodInvoicePrinter.someOtherPrintMethod(invoice); // unavailable! great.
		
		
		SomeOtherGoodInvoicePrinter_I someOtherGoodInvoicePrinter = new SomeOtherGoodInvoicePrinter();
		// other 2 methods are unavailable
		someOtherGoodInvoicePrinter.someOtherPrintMethod(invoice);
	}


}
