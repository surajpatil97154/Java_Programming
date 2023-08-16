
public class LargestAndSmallestNumberInArray {
	
	public static void main(String[] args) {
		int temp =0;
		int[] arr = {20,1,16,23,27,11,50,17,25};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest Number in array - "+arr[0]);
		System.out.println("Largest Number in array - "+arr[arr.length-1]);
	}
}
