import java.io.*;
public class P2T2 
{
   public static void main(String[] args) throws IOException
   {
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       matematikaCanggihBeraksi mcb = new matematikaCanggihBeraksi();
       
        int pilih=0;
        while(pilih != 4)
        {
            System.out.print("Masukkan nilai a: ");
            int a = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai b: ");
            int b = Integer.parseInt(dataIn.readLine());
            System.out.print("1. Penjumlahan\n2. Perkalian\n3. Modulus\n4. Keluar \nPilih: ");
            pilih = Integer.parseInt(dataIn.readLine());
            switch(pilih)
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
                case 4:
                    System.out.println("Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }
    }
}
class matematikaCanggih
{
    public void penjumlahan(int a, int b)
    {
        System.out.println("Penjumlahan: "+(a+b));
    }
    public void perkalian(int a, int b)
    {
        System.out.println("Perkalian: "+(a*b));
    }
}
class matematikaCanggihBeraksi extends matematikaCanggih
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
