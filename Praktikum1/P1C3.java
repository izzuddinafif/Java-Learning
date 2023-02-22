import java.io.*;
public class P1C3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==== Menghitung Grade Huruf Mutu ====");
        System.out.print("Masukkan nilai huruf anda (A/B/C/D/E): ");
        String str = input.readLine();
        switch(str){
            case "A":
                System.out.println("Range nilai 75 sampai 100");
                break;
            case "B":
                System.out.println("Range nilai 65 sampai 74");
                break;
            case "C":
                System.out.println("Range nilai 55 sampai 64");
                break;
            case "D":
                System.out.println("Range nilai 45 sampai 54");
                break;
            case "E":
                System.out.println("Range nilai 0 sampai 44");
                break;
            default:
                System.out.println("Data yang anda masukkan salah");
        }
    }
}
