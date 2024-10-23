package model;

public class Staff extends User {
    public Staff(String nama, String telepon, String alamat, String ttl) {
        super(nama, telepon, alamat, ttl);
    }

    private String nIK;

    
    public String getnIK() {
        return nIK;
    }

    public void setnIK(String nIK) {
        this.nIK = nIK;
    }

    @Override
    public String toString() {
        return super.toString() + "NIK=" + nIK +  "";
    }
    
}
