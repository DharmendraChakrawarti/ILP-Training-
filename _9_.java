import java.util.Scanner;

public class _9_ {

    // Find the last letter of the String

    // Input:
    // Hello How are You

    // Output:
    // oweu
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] arr= input.split(" ");
        String str ="";
        for(int i=0;i<arr.length;i++){
            String s= arr[i];
            str+= s.charAt(s.length()-1);
        }
        System.out.println(str);
    }
}
