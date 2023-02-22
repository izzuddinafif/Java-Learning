import java.io.*;
public class P2D2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nilaiAkhir;
        System.out.print("Input nilai UTS: ");
        int uts= Integer.parseInt(br.readLine());
        System.out.print("Input nilai UAS: "); 
        int uas= Integer.parseInt(br.readLine());
        if(uts>70)
        {
            nilaiAkhir=uts;
            System.out.println("Lulus dengan nilai akhir: "+nilaiAkhir);
        }
        else if(uts<=70)
        {
            nilaiAkhir=uts*40/100+uas*60/100;
            if(nilaiAkhir>=60)
                System.out.println("Lulus dengan nilai akhir: "+nilaiAkhir);
            else
                System.out.println("Tidak lulus dengan nilai akhir: "+nilaiAkhir);
        }
    }
}
