import java.util.Scanner;

//input widodo 21 banyuwangi 21 juni 1970 Laki-laki
public class QuizScanner04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program KTP");
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();
        System.out.print("Masukkan Tanggal : ");
        String tanggaLahir = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        String jenisKelamin = scanner.nextLine();
        System.out.println("Nama: "+nama);
        System.out.println("tempatLahir : "+tempatLahir);
        System.out.println("Jenis kelamin : "+jenisKelamin);
    }
}