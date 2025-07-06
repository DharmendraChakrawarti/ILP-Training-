import java.util.Scanner;

public class _7_ {
    // Remove the character from the String

    // Input:
    // Enter the String:Hello
    // Enter the Character:l

    // Ouput:
    // The String after removing is:Heo
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       char c = sc.next().charAt(0);
        String sum ="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=c){
                    sum+= input.charAt(i);
            }
          
        }
        System.out.println(sum);
    }
}
