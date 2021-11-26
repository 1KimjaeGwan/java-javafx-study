package b.defaults;

public class Windows {
	
	public void print(Printable printer) {
		printer.print();
	}
	
//	public void print(LGPrinter printer) {
//		printer.PrintLG();
//	}
//	
//	public void print(SamsungPrinter printer) {
//		printer.samsungPrint();
//	}
	
	public static void main(String[] args) {
		Windows windows = new Windows();
		LGPrinter lgPrinter = new LGPrinter();
		SamsungPrinter samsungPrinter = new SamsungPrinter();
		windows.print(lgPrinter);
		windows.print(samsungPrinter);
		lgPrinter.colorPrint();
	}
}
