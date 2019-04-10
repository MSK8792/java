package algorithm.sort;

public class selection {
	public int[] selectionsort(int arr[],int n) {
		int i=0;
		for(;i<n-1;i++)
		{
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[index]) {
					index=j;//searching for lowest index
				}
			}
			int smallernumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallernumber;
			System.out.println("sorting using selection sort");
			try {
				Thread.sleep(1000);
			}
		catch(InterruptedException e) {
			//TODO auto genetated catch block
			e.printStackTrace();
				}
			}
		System.out.println("sorting using selection sort");
		return arr;
		}
	}

