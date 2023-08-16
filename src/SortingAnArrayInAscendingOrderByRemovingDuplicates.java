
public class SortingAnArrayInAscendingOrderByRemovingDuplicates {
	public static void main(String[] args) {
		int[] arr = {10,23,21,10,23,22,34,14};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i] =arr[i]-arr[j];
				}
			}
		}
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
			//temp[j++]=arr[arr.length-1];
			
		}
		for(int a:temp) {
			System.out.println(a);
		}
	}
}
