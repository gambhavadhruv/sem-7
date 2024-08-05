public class String_split {
    public static void main(String[] args) {
        String str = "Dhruv Gambhava";
        char[] ch = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
            System.out.println(ch[i]);
        }
    }
}
