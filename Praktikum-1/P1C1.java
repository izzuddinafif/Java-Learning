import java.io.*;
public class P1C1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nrp, nama;
        System.out.print("NRP: ");
        nrp=br.readLine();
        System.out.print("Nama:");
        nama=br.readLine();
        System.out.println("==================================");
        System.out.println("Nama saya adalah "+nama);
        System.out.println("NRP saya adalah "+nrp);
    }
}