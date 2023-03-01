import java.io.*;
public class P2T2
{
    private int pil;
    public void penjumlahan(int a, int b)
    {
        System.out.println("Penjumlahan: "+(a+b));
    }
    public void perkalian(int a, int b)
    {
        System.out.println("Perkalian: "+(a*b));
    }
}
class matematikaCanggih extends P2T2
{
    public void modulus(int a, int b)
    {
        System.out.println("Modulus: "+(a%b));
    }
    public void penjumlahan1(int a, int b)
    {
        super.penjumlahan(a, b);
    }
    public void perkalian2(int a, int b)
    {
        super.perkalian(a, b);
    }
}
class matematikaCanggihBeraksi extends matematikaCanggih
{
    public static void main(String[] args)
    {
        matematikaCanggihBeraksi mcb = new matematikaCanggihBeraksi();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Masukkan bilangan pertama: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Masukkan bilangan kedua: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("Pilihan: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Modulus");
            System.out.print("Pilihan: ");
            int pil = Integer.parseInt(br.readLine());
            switch(pil)
            {
                case 1:
                    mcb.penjumlahan1(a, b);
                    break;
                case 2:
                    mcb.perkalian2(a, b);
                    break;
                case 3:
                    mcb.modulus(a, b);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
    }
}