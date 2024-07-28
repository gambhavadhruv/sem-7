import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splitedstr = str.split(" ");
        int count = 0;
        // ArrayList<String> arlist = new ArrayList<String>();
        // for(int i=0; i<str.length()-1; i++){
        //     for(int j=i+1; j<str.length(); j++){
        //         if (splitedstr[i].equals(splitedstr[j])) {
        //             arlist.add(splitedstr[i]);
        //         }
        //     }
        // }
        // System.out.println(arlist);
        for(int i=0; i<splitedstr.length; i++){
            for(int j=0; j<splitedstr.length; j++){
                if (splitedstr[i].equals(splitedstr[j])) {
                    count++;
                }
            }
            System.out.println(splitedstr[i]+" -> "+count);
             count = 0;
        }
    }
}
