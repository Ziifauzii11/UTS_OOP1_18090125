/**
 * Nama : Dwi Febi Fauzi
 * NIM  : 18090125
 * Kelas: 4B
 */
package Mahasiswa;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String no_hp;
    private String jurusan;

    public Mahasiswa(){}
    public Mahasiswa(String nim, String nama, String alamat, String no_hp, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.jurusan = jurusan;
    }
    @Override
    public boolean equals(Object obj) {
        Mahasiswa mhs = (Mahasiswa) obj;
        if(this.nim.equals(mhs.getnim())){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "[ "+ nim +", "+ nama +", "+ alamat +", "+ no_hp +", "+ jurusan +" ];";
    }

    public String getnim() {
        return nim;
    }
    public void setnim(String nim) {
        this.nim = nim;
    }
    public String getnama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getalamat() {
        return alamat;
    }
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }
    public String getno_hp() {
        return no_hp;
    }
    public void setno_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    public String getjurusan() {
        return jurusan;
    }
    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}