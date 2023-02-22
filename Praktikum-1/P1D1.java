import java.io.*;
public class P1D1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NIK: ");
        String NIK= br.readLine();
        System.out.print("Nama: ");
        String nama= br.readLine();
        System.out.print("Tempat/Tanggal Lahir: ");
        String TTL= br.readLine();
        System.out.print("Jenis Kelamin: ");
        String JK= br.readLine();
        System.out.print("Alamat: ");
        String alamat= br.readLine();
        System.out.print("Agama: ");
        String agama= br.readLine();
        System.out.print("Status: ");
        String status= br.readLine();
        System.out.print("Pekerjaan: ");
        String pekerjaan= br.readLine();
        System.out.print("Kewarganegaraan: ");
        String kewarganegaraan= br.readLine();
        System.out.print("Berlaku Hingga: ");
        String berlaku= br.readLine();
        System.out.println("-----------------------------");
        System.out.println("NIK: "+NIK);
        System.out.println("Nama: "+nama);
        System.out.println("Tempat/Tanggal Lahir: "+TTL);
        System.out.println("Jenis Kelamin: "+JK);
        System.out.println("Alamat: "+alamat);
        System.out.println("Agama: "+agama);
        System.out.println("Status: "+status);
        System.out.println("Pekerjaan: "+pekerjaan);
        System.out.println("Kewarganegaraan: "+kewarganegaraan);
        System.out.println("Berlaku Hingga: "+berlaku);
    }
}
