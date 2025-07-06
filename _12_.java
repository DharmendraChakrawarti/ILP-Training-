import java.util.Scanner;

public class _12_ {
    // Count the number of spaces in the String and if the spaces are greater than
    // or equal to 3 then it should print the count else it should print the message
    // NAN

    // Input:
    // Welcome to my world of programming

    // Output:
    // 5

    // Input:
    // Hello Hi

    // Output:
    // NAN
    // because the
    // space is 1
    // which is
    // less than 3

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                count++;
            }
        }
        if (count>=3)System.out.println(count);
        else System.out.println("NAN");
    }
}
