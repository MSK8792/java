
import algorithm.search.*;
import algorithm.sort.*;

class Sort extends Thread{
	String str;
	Sort(int i){
		if(i==1)
			str = "Bub";
		else
			str = "Sel";
	}
	public void run(){
		int arr[] = {5,3,1,6,4};
		int arr1[] = {25,23,21,26,24};
		int array[];
		int n=5;
		if(str.equals("Bub")){
			bubble b = new bubble();
			array =  b.bubblesort(arr1, n);
			for(int i = 0;i<array.length;i++)
				System.out.println(array[i]);
		}
		else{
			selection s = new selection();
			array=s.selectionsort(arr, n);
			for(int i = 0;i<array.length;i++)
				System.out.println(array[i]);
		}
	}
}

class Search extends Thread
{
	public void run()
	{
		int arr[] = {15,13,11,16,14};
		int array[];
		int n=5,key=13;
		bubble b = new bubble();
		array =  b.bubblesort(arr, n);
		binary bs=new binary();
		bs.binarysearch(arr, n, key);
	}
}

public class p7
{
	public static void main(String args[])
	{
		Sort s1 = new Sort(1);
		Sort s2 = new Sort(2);
		s1.start();
		s2.start();
		Search s3 = new Search();
		s3.start();
	}
}
