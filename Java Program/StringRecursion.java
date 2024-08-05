kimport java.util.*;
public class StringRecursion{
String rev(String str) {
if(str.length() == 0)
return " ";
return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1)); }
public static void main(String[ ] args) {
StringRecursion r=new StringRecursion();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
String s=sc.nextLine();
System.out.println("Reversed String: "+r.rev(s)); }
}