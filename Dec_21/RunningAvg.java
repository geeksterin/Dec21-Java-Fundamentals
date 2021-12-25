public class RunningAvg {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 4, 5, 0, 3, 10, 2, 3 };

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i - 1];
            System.out.println(sum / i);
        }
    }
}
