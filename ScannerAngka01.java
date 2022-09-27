import java.util.Scanner;

//input 15 dan 67
public class ScannerAngka01 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}