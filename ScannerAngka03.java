import java.util.Scanner;

// Input 12345678 dan 87654322
public class ScannerAngka03 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Scanner");
        System.out.print("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt(); 
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
