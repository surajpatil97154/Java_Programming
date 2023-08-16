
public class ThisKeyword {
	public static void main(String[] args) {
		ThisKeyword a1 = new ThisKeyword();
		System.out.println(a1);
		a1.test();
		ThisKeyword a2 = new ThisKeyword();
		System.out.println(a2);
		a2.test();
		static_Test();
		  
	}

	private static void static_Test() {
	//	System.out.println(this);
		
	}

	private void test() {
		System.out.println(this);
		
	}
	/*
	 * This keyword is should not be used in static method 
	 * usring this keyword we can access static and non static members in java.
	 * Using this keyword we can call  constructor but  another constructor  it should 
	 * be first statement inside the constructor 
	 */

	
}
