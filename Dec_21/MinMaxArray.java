public class MinMaxArray {
    public static void main(String[] args) {
        // static array init
        int arr[] = { -1, -1, 0, 10, 1, 5, 6 };

        // int min = Integer.MAX_VALUE; // +infinite
        // int max = Integer.MIN_VALUE; // -infinite

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);

    }
}
