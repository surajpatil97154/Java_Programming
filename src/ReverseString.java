
public class ReverseString {
	public static void main(String[] args) {
		String str = "Suraj";
		for(int i=str.length()-1;i>=0;i--) {
			char charAt = str.charAt(i);
			System.out.print(charAt);
		}
	}
}
