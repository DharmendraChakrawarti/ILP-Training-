import java.util.*;

public class _17_large_word {
    public static void main(String[] args) {
        // Find the Largest Word in a String
        // Input: Hey Hello you are having any trouble
        // Output:trouble
        // ination:
        // Hey:3
        // Hello:3
        // you:3
        // are:3
        // having:6
        // any:6
        // trouble:7
        // The Word "trouble" is having high Length, so "trouble" is the output

      Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        Map<String, Integer> mp = new HashMap<>();
        String str = "";
        int c = 0;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                str += st.charAt(i);
                c++;
            } else {
                if (!str.isEmpty()) {
                    mp.put(str, c);
                    str = "";
                    c = 0;
                }
            }
        }

        if (!str.isEmpty()) {
            mp.put(str, c);
        }

        String maxWord = "";
        int maxLen = 0;

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > maxLen) {
                maxLen = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println(maxWord);
    }
}
