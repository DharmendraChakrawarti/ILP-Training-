import java.util.Scanner;

public class _8_ {
    // Find the reverse of the String

    // Input:
    // Hello World

    // Output:
    // dlroW olleH
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StringBuffer sb = new StringBuffer(sc.nextLine());
     sb = sb.reverse();
     System.out.println(sb);
    }
}
