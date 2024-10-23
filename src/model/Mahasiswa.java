package model;

public class Mahasiswa extends User{
    private String nIM, jurusan;
    
    public Mahasiswa(String nIM, String telepon, String alamat, String ttl) {
        super(nIM, telepon, alamat, ttl);
    }

    public String getnIM() {
        return nIM;
    }

    public void setnIM(String nIM) {
        this.nIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "NIM=" + nIM + ", jurusan=" + jurusan;
    }
        
}
