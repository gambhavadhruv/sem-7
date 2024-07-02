import java.util.*;
public class Clock_angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minute : ");
        int min = sc.nextInt();
        System.out.println("Enter Hour : ");
        int hr = sc.nextInt();
        int m = min*6;
        int h = hr*30;
        if (h > m) {
            if ((h-m)>180 || (h-m) == 180) {
                double ans = 360 - (h-m) - (0.5*min);
                System.out.println("Angle between minute and hour is : "+ans);
            }
            else{
                double ans = (h - m) + (0.5*min);
                System.out.println("Angle between minute and hour is : "+ans);
            }
        }

        if (m > h) {
            if ((m-h)>180 || (m-h) == 180) {
                double ans = 360 - (m-h) + (0.5*min);
                System.out.println("Angle between minute and hour is : "+ans);
            }
            else{
                double ans = (m - h) + (0.5*min);
                System.out.println("Angle between minute and hour is : "+ans);
            }
        }
        if (m==h) {
            double ans = 0.5*min;
            System.out.println("Angle between minute and hour is : "+ans);
        }
    }
}
