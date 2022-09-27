import java.util.Scanner;

//Program Hitung Limas Segi Empat
public class QuizScanner05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Hitung Limas Segi Empat");
        System.out.print("Masukkan Sisi Limas : ");
        String sisiLimas = scanner.nextLine();
        System.out.print("Masukkan Tinggi Limas : ");
        String tinggiLimas = scanner.nextLine();
        System.out.print("Masukkan Volume Limas : ");
        String volumeLimas = scanner.nextLine();
        System.out.println("Sisi Limas :"+ sisiLimas);
        System.out.println("Tinggi Limas : "+ tinggiLimas);
        System.out.println("Volume Limas : "+ volumeLimas);
    }
}
