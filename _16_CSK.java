import java.util.*;

public class _16_CSK {

    public static void main(String[] args) {
        // Input:
        // CHNKSC
        // Output:
        // CSK
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // str=str.toLowerCase();
        String s ="";
        if(str.contains("CHN")){
       for(int i=str.length()-1;i>=3;i--){
                s+=str.charAt(i);
       }
        }
        System.out.println(s);

    }

}
