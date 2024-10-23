package model;
import java.util.LinkedList;

public class Magister extends Mahasiswa{
    public Magister(String nama, String telepon, String alamat, String ttl) {
        super(nama, telepon, alamat, ttl);
    }

    LinkedList<MataKuliah> mataKuliah = new LinkedList<MataKuliah>();
    String judulPenelitianTesis;
    

    public LinkedList<MataKuliah> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(LinkedList<MataKuliah> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "mataKuliah=" + mataKuliah + ", judulPenelitianTesis=" + judulPenelitianTesis;
    }
    
    
}
