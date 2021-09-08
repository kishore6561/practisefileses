package week1.day2;

public class FrenquencyOfNumber 
{

	public static void main(String[] args) 
	{
		   int arr[]={3,4,2,5,1,2,6,3,6,2,4,7,1};
		    int [] frequencyarr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++)
	        {  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j])
	                {  
	                    count++;  
	                    frequencyarr[j] = visited;  
	                }  
	            }  
	            if(frequencyarr[i] != visited)  
	            {
	                frequencyarr[i] = count;  
	        	}
	        }
	        
	            for(int i = 0; i < frequencyarr.length; i++)
	            {  
	            if(frequencyarr[i] != visited) 
	            {
	            	System.out.println( arr[i] + " occured  " + frequencyarr[i]+ " times ");
	            }
	            }
		}

}
