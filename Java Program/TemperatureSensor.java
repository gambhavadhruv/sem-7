import java.util.*;

public class TemperatureSensor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial temperature : ");
        int IT = sc.nextInt();
        System.out.print("Enter temperature when device get damage: ");
        int T = sc.nextInt();
        System.out.print("Enter average minutes when increase temperature by 1 : ");
        int AM = sc.nextInt();

        String tempcolour;
        if (IT >= 10 && IT <= 20) {
            tempcolour = "Green";
        }
        else if (IT >= 21 && IT <= 50) {
            tempcolour = "Yellow";
        }
        else if (IT >= 51 && IT <= 70) {
            tempcolour = "Red";
        }
        else{
            tempcolour = "Unknown";
        }

        int tempdiff = T - IT;
        int tempcal = tempdiff * AM;
        System.out.println(tempcolour + " " + tempcal);
    }
}
