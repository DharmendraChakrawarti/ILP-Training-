import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _13_ {

    // Input:
    // Hello Hey

    // Output:
    // Helo ey

    // Input:
    // Hello

    // Output:
    // Helo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> seen = new HashSet<>();
        String ans = "";
        for (char c : input.toCharArray()) {
            if (c == ' ' || !seen.contains(c)) {
                ans += c;
                if (c != ' ') {
                    seen.add(c);
                }
            }
        }
        System.out.println(ans);

    }
}
