package TestingAss;

public class findMinMax {
	
	public int[] findMaxMin(int arr[])
	{
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		
		}
		int minMax[]= {min,max};
		return minMax;
	}

}
