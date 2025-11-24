package monitoria_aeds2;
import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            System.out.println(input + " % 6 = " + (input % 6));
            System.out.println(input + " % 3 = " + (input % 3));
            System.out.println(input + " % 5 = " + (input % 5));
            System.out.println(input + "- 1 % 5 = " + ((input-1) % 5));
            if(input == 0){
                break;
            }
        }
    }
}
