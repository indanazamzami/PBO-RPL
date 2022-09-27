import java.util.Scanner;

//input 11 dan RPL
public class QuizScanner02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Kelas");
        System.out.print("Masukkan Kelas Berapa : ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.println("Kelas "+kelas+" Jurusan "+jurusan);
    }
}
