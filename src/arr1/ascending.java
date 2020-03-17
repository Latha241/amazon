package arr1;

public class ascending {
public static void main(String[]args) {
	int[]arr=new int[]{5,2,8,7,4};
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	System.out.println("elements of array sorted in a ascending order:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");
	}
}
}
