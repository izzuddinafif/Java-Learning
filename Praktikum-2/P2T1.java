import java.io.*;
public class P2T1 {
    private int no, saldo;
    private String nama;
    public void setNo(int no)
    {
        this.no=no;
    
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    public void setSaldo(int saldo)
    {
        this.saldo=saldo;
    }
    public int getNo()
    {
        return no;
    }
    public String getNama()
    {
        return nama;
    }
    public int getSaldo()
    {
        return saldo;
    }
    public void input()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("No: ");
            no=Integer.parseInt(br.readLine());
            System.out.print("Nama: ");
            nama=br.readLine();
            System.out.print("Saldo: ");
            saldo=Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
    }
    public void output()
    {
        System.out.println("==================================");
        System.out.println("No: "+no);
        System.out.println("Nama: "+nama);
        System.out.println("Saldo: "+saldo);
    }
    public void tarik(int jumlah)
    {
        saldo-=jumlah;
    }
    public void setor(int jumlah)
    {
        saldo+=jumlah;
    }
    public void print()
    { 
        System.out.println("==================================");
        System.out.println("1. Menabung");
        System.out.println("2. Tarik Uang");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Keluar");
        System.out.println("Silahkan Memilih: ");
    }
    public int pilihan() throws IOException  
    {
        int pil;
        BufferedReader br = new BufferedReader(new InputStreamReader   (System.in));
        pil=Integer.parseInt(br.readLine());
        return pil;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P2T1 tb = new P2T1();
        int p=0;
        tb.input();
        tb.output();
        while(p!=4)
        {
            tb.print();
            p=tb.pilihan();
            if(p==1)
            {
                System.out.print("Masukkan Jumlah Uang: ");
                tb.setor(Integer.parseInt(br.readLine()));
            }
            else if(p==2)
            {
                System.out.print("Masukkan Jumlah Uang: ");
                tb.tarik(Integer.parseInt(br.readLine()));
            }
            else if(p==3)
            {
                System.out.println("Saldo Anda: "+tb.getSaldo());
            }
            else if(p==4)
            {
                System.out.println("Terima Kasih");
            }
            else
            {
                System.out.println("Pilihan Anda Salah");
            }
        }
    }
}
