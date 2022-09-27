import java.util.Scanner;

//guru dan 30
public class QuizScanner03 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Hitung Pensiun Kerja");
        System.out.print("Masukkan Nama Pekerjaan: ");
        String pekerjaan = scanner.nextLine();
        System.out.print("Masukkan Umur : ");
        int umur = scanner.nextInt();
        System.out.println("Nama Pekerjaan : "+pekerjaan);
        System.out.println("Umur : "+umur);
        int pensiun = 65;
        System.out.println(" Sisa tahun sebelum Pensiun :" + pensiun);
    }
}