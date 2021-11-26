package c2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("A");
		s1.add("D");
		s1.add("B");
		s1.add("C");
		
		System.out.print("[ ");
		Iterator<String> itr = s1.iterator();
		// 반복자 내부에 꺼내올 값이 존재하면 true
		// 더이상 꺼내올 값이 없으면 false 
		// Set 내부에 값의 개수 변경되는 연산이 이루어 질때는
		// iteraor(반복자)를 이용하는게 안전하다.
		while(itr.hasNext()) {
			String s = itr.next();
//			if(s.equals("A")) {
//				itr.remove();
//			}
			System.out.print(s+" ");
		}
		System.out.println("]");	
		
		System.out.println(s1.contains("A"));
		
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		s2.add("E");
		
		System.out.print("[ ");
		for(String s : s2) {
			System.out.print(s+" ");
//			if(s.equals("A")) {
//				s2.remove(s);
//			}
		}
		System.out.println("]");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		Set<String> s3 = new HashSet<>(s1);
		System.out.println(s3);
		// 합집합
		s3.addAll(s2);
		System.out.println("s3 : "+s3);
		
		Set<String> s4 = new HashSet<>(s1);
		// 교집합
		s4.retainAll(s2);
		System.out.println(s4);
		System.out.println("size : "+s4.size());
		s4.add(null);
		System.out.println(s4);
		s4.add(null);
		System.out.println(s4);
		s4.clear();
		System.out.println(s4.isEmpty());
		System.out.println(s4);
	}

}
