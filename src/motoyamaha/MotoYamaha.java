package motoyamaha;
        
public class MotoYamaha {
    

    protected String merk;
    protected int tahunProduksi;

    public MotoYamaha(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public MotoYamaha(int tahunProduksi, String merk) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    public MotoYamaha(){}

    public String getWerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public void tampilHasil(){
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);

    } 
}
