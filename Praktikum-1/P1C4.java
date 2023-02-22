import java.io.*;
public class P1C4 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Saldo: ");
        double saldo = Double.parseDouble(br.readLine());
        double bunga = 0.5, j = 0;
        int n = 0;
        for(n=0; n<=10; n++)
        {
            j=saldo+(saldo*(bunga*n));
            System.out.println("Saldo setelah "+n+" tahun: "+j);
        }
    }
}
