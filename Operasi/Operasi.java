/**
 * Nama : Dwi Febi Fauzi
 * NIM  : 18090125
 * Kelas: 4B
 */
package Operasi;

import java.util.ArrayList;
import java.util.List;
import Mahasiswa.Mahasiswa;

public class Operasi{
    
    private static List<Mahasiswa> listmhs = new ArrayList<>();

    public int cekGetIndex(Mahasiswa mhs){
        return listmhs.indexOf(mhs);
    }
    public void tambahmahasiswa(Mahasiswa mhs){
        listmhs.add(mhs);
        System.out.println("Data disimpan ");
    }
    public void ubahmahasiswa(Mahasiswa mhs){
        int result = cekGetIndex(mhs);
        if(result >= 0){
            listmhs.set(result, mhs);
            System.out.println("berhasil diubah");
        }else{
            System.out.println("\nNIM tidak ditemukan");
        }
    }
    public void hapusSemuaMahasiswa(){
        listmhs.clear();
        System.out.println("Data mahasiswa dihapus semua");
    }
    public void hapusMahasiswa(Mahasiswa mhs){
        int result = cekGetIndex(mhs);
        if(result >= 0){
            listmhs.remove(result);
            System.out.println("\nData mahasiswa pada index: "+ result +", nim: "+ mhs.getnim() +" dihapus");
        }else{
            System.out.println("\nNIM tidak ditemukan");
        }
    }
    public List<Mahasiswa> tampilkanMahasiswa(){
        return listmhs;
    }
} 