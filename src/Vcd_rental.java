public class Vcd_rental extends Vcd{
    String aktor,sutradara, kategori;
    
    Vcd_rental(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    Vcd_rental(){
        
    }
    
}
