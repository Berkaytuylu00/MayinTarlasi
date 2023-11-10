import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.print("Mayın Tarlası Oyununa Hoşgeldiniz\n");
        System.out.println("Lütfen satır ve sütun sayısını giriniz: ");
        System.out.print("Satır sayısını giriniz: ");
        row = scan.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        column = scan.nextInt();

        MayinTarlasi game = new MayinTarlasi(row, column);
        game.oyunuBaslat();
    }
}