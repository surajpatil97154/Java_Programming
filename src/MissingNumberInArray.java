
public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] i = {1,2,3,5,6,8};
		for(int n=0;n<i.length-1;n++) {
			
			int a= i[n];
			a++;
			if(a!=i[n+1]) {
				System.out.println("Missing number is "+a);
			}
		}
		
	}
}
