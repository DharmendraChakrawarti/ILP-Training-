import java.util.*;

public class _15_non_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Set<Character> seen = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            seen.add(ch); 
        }

        String dc ="";
        for (char ch : seen) {
            dc+=ch;
        }

        System.out.println(dc);
    }
}
