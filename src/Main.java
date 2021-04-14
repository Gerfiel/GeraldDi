import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih,repeat;
        do
        {
            Scanner inputUser = new Scanner(System.in);
            Vcd_rental vcd = new Vcd_rental();
            System.out.println("");
            System.out.print("Masukkan Judul        : ");
            vcd.judul=inputUser.nextLine();
            System.out.print("Masukkan Publisher    : ");
            vcd.publisher=inputUser.nextLine();
            System.out.print("Masukkan Aktor        : ");
            vcd.aktor=inputUser.nextLine();
            System.out.print("Masukkan Sutradara    : ");
            vcd.sutradara=inputUser.nextLine();

            System.out.println("           Kategori");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.print("Pilih nomer berapa?   : ");
            pilih=inputUser.nextInt();

            switch(pilih){
                case 1:
                    vcd.kategori="Semua Umur";
                    break;
                case 2:
                    vcd.kategori="Dewasa";
                    break;
                case 3:
                    vcd.kategori="Remaja";
                    break;
                case 4:
                    vcd.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");
                    return;
            }
            System.out.print("Stok                   : ");
            vcd.stok=inputUser.nextInt();
            System.out.println("            DAFTAR");
            System.out.println("==============================");

            System.out.println("Judul Film          : "+vcd.judul);
            System.out.println("Sutradara           : "+vcd.sutradara);
            System.out.println("Aktor Film          : "+vcd.aktor);
            System.out.println("Publishe            : "+vcd.publisher);
            System.out.println("Kategori            : "+vcd.kategori);
            System.out.println("Jumlah Stok         : "+vcd.stok);

            System.out.println("\n");
            System.out.println("Mau Coba Lagi?\nYa[1] atau Tidak [2]");
            System.out.print("Pilih nomer berapa? : ");
            repeat=inputUser.nextInt();
        } while (repeat<2);
    }
    
}
