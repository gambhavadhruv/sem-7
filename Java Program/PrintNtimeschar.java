// import java.util.*;
// public class PrintNtimeschar {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         StringBuilder s = new StringBuilder();
//         System.out.println("Enter string  : ");
//         String str = sc.nextLine();
//         for(int i=0; i<str.length(); i+=2){
//             char letter = str.charAt(i);
//             int count = Character.getNumericValue(str.charAt(i+1));
//             for(int j=1;j<=count;j++){
//                 s.append(letter);
//             }
//         }
//         System.out.println(s.toString());
//     }
// }





import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintNtimeschar {
    public static void main(String[] args) {
        String input = "A11B2C3";
        System.out.println(expandString(input));
    }

    public static String expandString(String input) {
        StringBuilder output = new StringBuilder();
        Pattern pattern = Pattern.compile("([A-Z])(\\d+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String character = matcher.group(1);
            int count = Integer.parseInt(matcher.group(2));
            for (int i = 0; i < count; i++) {
                output.append(character);
            }
        }

        return output.toString();
    }
}
