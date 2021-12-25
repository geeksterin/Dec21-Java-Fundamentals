package Day3;

public class PalindromeinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,3,4,3,2,-1,-4,0};
//		 int arr[]={1,2,3,4,5};
         int max=Integer.MAX_VALUE;
         int sec_max=Integer.MAX_VALUE;
         
         for(int i=0;i<arr.length;i++){
             if(max<arr[i]){
                 sec_max=max;
                 max=arr[i];
             }
         }
         
         System.out.println(sec_max);

		
		
		

	}

}
