package a.object.clone;

public class CloneExample {

	public static void main(String[] args) {
		Member member = new Member(
							"최기근",
							28,
							new int[] {100,99,95}, 
							new Car("캐스퍼")
						);
		System.out.println(member);
		Member cloned = member.getMember();
		System.out.println(cloned);
		System.out.println(member.hashCode());
		System.out.println(cloned.hashCode());
		
		cloned.score[0] = 90;
		cloned.car.model = "소나타";
		cloned.name = "심현석";
		
		System.out.println(cloned);
		System.out.println(member);
		
		
	}

}
