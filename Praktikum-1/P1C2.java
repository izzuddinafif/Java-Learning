import java.io.*;
public class P1C2{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total Belanja: ");
        int totalBelanja = Integer.parseInt(br.readLine());
        int diskon;
        if (totalBelanja >= 100000) {
            diskon = totalBelanja/10;
        } else {
            diskon = 0;
        }
        System.out.println("Diskon = "+diskon);
    }
}