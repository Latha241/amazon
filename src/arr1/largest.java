package arr1;

public class largest {
	static int arr[]= {5,100,30,120,20,500};
	static int largest()
	{
		int i;
		int max=arr[0];
		for(i=1;i<arr.length;i++) 
			if(arr[i]>max)
				max=arr[i];
			return max;
	}
			public static void main(String[]args) {
				System.out.println("largest number is given array is"+largest());
			}
		}
	


