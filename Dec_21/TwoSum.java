package Dec_21;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+"at"+i+"index and "+arr[j]+"at index"+j);
                }
            }
        }

    }
}

