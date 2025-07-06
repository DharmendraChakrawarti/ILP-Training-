import java.util.Scanner;

public class _14_ {
    public static void main(String[] args) {
        // Count the Number of vowels and consonents in a String
        // Input:
        // Welcome1234
        // Output:
        // Number of Vowels:3
        // Number of Consonents:4
        // Number of Numbers:4

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
           str=str.toLowerCase();
           int vo=0;
           int co=0;
           int nu=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vo++;
            }
            else if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'
            ||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='0'){
              nu++;
            }
            else{
           co++;
            }
        }
          System.out.println("vovel "+vo);
          System.out.println("Consonents "+co);
          System.out.println("Numbers "+nu);
    }}

