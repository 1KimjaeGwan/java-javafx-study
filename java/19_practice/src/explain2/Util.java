package explain2;


public class Util {

	/*
	 * 반환타입은 Pair에 Value 타입
	 * getValue(Pair , 두번째) 두번째 매개변수는 Pair의 Key type
	 */
	public static <K,V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		}
		return null;
	}
	/*
		getValue() 작성	
	*/
}
