import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.println("Lütfen denemek istediğiniz sayıyı giriniz : ");
        sayi = input.nextInt();


        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı degildir.");
        }
    }
}

