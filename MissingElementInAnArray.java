package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,4,6,8};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}
		}

	}

}
