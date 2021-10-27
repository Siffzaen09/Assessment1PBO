package id.zaen;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahunKeluaran, double harga, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk() {
        return merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public void displayInfo(){
        System.out.println("Merk : " + getMerk());
        System.out.println("Harga : " + String.format("%.1f", getHarga()));
        System.out.println("Tahun Keluaran : " + getTahunKeluaran());
        System.out.println("Sisa Stok : " + getStok() + "\n");
    }
}
