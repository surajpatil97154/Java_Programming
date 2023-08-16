
public class FindPrimeNumber {
public static void main(String[] args) {
	int flag =0;
	long i=1000000000;
	if(i==0 && i==1) {
		System.out.println("Number "+i+" is not prime number");
	}
	for(int n=2;n<i/2;n++) {
		if(i%n==0) {
			flag=1;
		}
	}
	
	if(flag==0) {
		System.out.println("prime number");
	}else {
		System.out.println("Not prime number");
	}
}
}
