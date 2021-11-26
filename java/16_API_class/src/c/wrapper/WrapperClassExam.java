package c.wrapper;

public class WrapperClassExam {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		int i = obj1;
		Integer obj2 = i;
		obj2 = 100;
		obj2 = Integer.valueOf(100);
		obj2 = Integer.valueOf("100");
		obj2 = new Integer("100");
		System.out.println(obj2);
		
		Integer obj3 = obj1 + obj2;
		System.out.println(obj3);
		
		Byte bytes = Byte.valueOf("1");
		Character ch = new Character('A');
		Short sh = new Short((short)100);
		Integer in = new Integer(200);
		Long l = new Long(300);
		Float f = new Float(3.14);
		Double d = new Double(3.14);
		Boolean bool = new Boolean("true");
		
		byte b = Byte.parseByte("1");
		short sho = Short.parseShort("2");
		int result = Integer.parseInt("12546");
		long lo = Long.parseLong("10000000");
		float flo = Float.parseFloat("3.141592");
		double dou = Double.parseDouble("3.141592265");
		boolean boole = Boolean.parseBoolean("true");
		System.out.println(result);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}

}
