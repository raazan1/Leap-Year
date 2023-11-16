import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Yıl Giriniz: ");
        int Year = input.nextInt();
        int Calc = Year % 4;
        if(Calc == 0){
            System.out.printf(Year + " :Artık Yıldır");
        }
        else {
            System.out.printf(Year + " :Artık Yıl Değildir");
        }
    }
}