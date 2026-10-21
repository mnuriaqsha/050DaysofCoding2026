
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.println("Tentukan Ganjil Genap Suatu Bilangan\n");
        System.out.println("Masukkan Bilangan");
        int gg = hi.nextInt();

        String hasil = (gg % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";

        System.out.println(gg + " adalah " + hasil);
    }
}
