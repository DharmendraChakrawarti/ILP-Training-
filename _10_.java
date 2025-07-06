import java.util.Scanner;

public class _10_ {

    // Find the average of the number according to the limits

    // Input:

    // Enter the Limit:5

    // Enter the Array:1,2,3,4,5

    // Enter the Limit1:2
    // Enter the Limit2:5

    // Output:
    // 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start < 0 || end > n || start >= end) {
            System.out.println("Invalid limits.");
            return;
        }

        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

   
        System.out.println(sum / (end - start));
    }
}
