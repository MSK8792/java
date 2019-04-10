package algorithm.sort;

public class bubble {
	public int[] bubblesort(int arr[],int n) {
		int temp=0;int i=0;
		for(;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					//swap elements
					temp=arr[j-1];
					arr[j]=temp;
				}
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				//TODO auto generated catch block
				e.printStackTrace();
			}
			System.out.println("sorting using bubblesort");
				
			}
			return arr;
	}
}