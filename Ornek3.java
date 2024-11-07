import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı (kare kenar uzunluğu) girmesini istiyoruz
        System.out.print("Kare için yıldız sayısını girin: ");
        int sayi = scanner.nextInt();

        // satır sayı için yazılan döngü
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) { // her satır için yazdırılan yıldız döngüsü
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
