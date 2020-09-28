import java.util.Scanner;
class MaxSum{
	public static void main(String[] args) {
		
		int maxsum=0;
		
		int[] a1 = {8,24,44,4};
		for (int i=0;i<a1.length;i++ ) {
		 	int sum =0;
		 	for (int j=i+1;j<a1.length;j++) {
		 		sum +=a1[j];
		 		for (int k=i;k<j-1;k++ ) {
				sum +=a1[k];
			}
		 	}	
			
			if (sum>maxsum) 
			{
		      maxsum = sum;
	        }
        }
	 System.out.println(maxsum);
	}
}