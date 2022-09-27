import java.util.Scanner;

//input 3 20000 Siomay
public class QuizScanner01 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Koperasi");
        System.out.print("Masukkan Pembelian Koin : ");
        int koin = scanner.nextInt();
        System.out.print("Masukkan Jumlah Uang : ");
        int jumlahUang = scanner.nextInt();
        System.out.print("Masukkan Barang Dibeli : ");
        int barangDibeli = scanner. nextInt();
        System.out.println("Jumlah Koin: "+ koin);
        System.out.println("Uang Bayar: "+ jumlahUang);
        System.out.println("Bayar Dibeli: "+ barangDibeli);
    }
}