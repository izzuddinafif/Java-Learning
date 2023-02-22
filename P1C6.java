import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1C6 {
    private static int a, b, c;
    private static int tambah()
    {
        return(a+b);
    }
    private static int kurang()
    {
        return(a-b);
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inputan harus berupa angka");
        System.out.print("Masukkan bilangan 1: ");
        a=Integer.parseInt(br.readLine());
        System.out.print("Masukkan bilangan 2: ");
        b=Integer.parseInt(br.readLine());
        c=tambah();
        System.out.println("Hasil Penjumlahan: "+c);
        System.out.println("Hasil Pengurangan: "+kurang());
    }
}
