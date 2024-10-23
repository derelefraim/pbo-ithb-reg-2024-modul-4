package model;
import java.util.LinkedList;

public class Sarjana extends Mahasiswa{
    
    public Sarjana(String nama, String telepon, String alamat, String ttl) {
        super(nama, telepon, alamat, ttl);
    }

    private LinkedList<MataKuliah> mataKuliah = new LinkedList<MataKuliah>();

    public LinkedList<MataKuliah> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(LinkedList<MataKuliah> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return super.toString() + "mataKuliah=" + mataKuliah;
    }      
    
}
