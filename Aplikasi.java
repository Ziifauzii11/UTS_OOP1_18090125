/**
 * Nama : Dwi Febi Fauzi
 * NIM  : 18090125
 * Kelas: 4B
 */
import java.util.List;
import java.util.Scanner;
import Mahasiswa.Mahasiswa;
import Operasi.Operasi;

public class Aplikasi{
 
    private static Scanner masukan;
    private static Operasi mhs = new Operasi();

    public static void main(String[] args){
        String jwb = "";
        masukan = new Scanner(System.in);
        do{
            menu();
            jwb = masukan.nextLine();
            System.out.println("\n============================================");
            switch(jwb){
                case "1": 
                    System.out.println("-- Tambah Data Mahasiswa --");
                    inputData();
                    break;
                case "2":
                    System.out.println("-- Ubah Data Mahasiswa --");
                    ubahData();
                    break;
                case "3":
                    System.out.println("-- Hapus Data Mahasiswa --");
                    hapusData();
                    break;
                case "4":
                    System.out.println("-- Data Mahasiswa --");
                    tampilData();
                    break;
                case "5":
                    System.out.println("Terima kasih telah menggunakan program");
                    break;
                default:
                    System.out.println("Pilihan anda tidak sesuai dengan daftar ");
                    break;
            }
            System.out.println("============================================");
        }while(!jwb.equals("5"));
    }
    private static void menu(){
        System.out.println("\n\n\n============================================");
        System.out.println("     Aplikasi Data Mahasiswa");
        System.out.println("============================================");
        System.out.println("1. Tambah data Mahasiswa");
        System.out.println("2. Ubah data Mahasiswa berdasarkan nim");
        System.out.println("3. Hapus data Mahasiswa");
        System.out.println("4. Tampilkan semua data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih salah satu -> ");
    }
    private static void inputData(){
        masukan = new Scanner(System.in);
        String nim, nama, alamat, no_hp, jurusan;
        System.out.print("NIM         > ");
        nim = masukan.nextLine();
        System.out.print("Nama        > ");
        nama = masukan.nextLine();
        System.out.print("Alamat      > ");
        alamat = masukan.nextLine();
        System.out.print("NO HP       > ");
        no_hp = masukan.nextLine();
        System.out.print("Jurusan     > ");
        jurusan = masukan.nextLine();
        mhs.tambahmahasiswa(new Mahasiswa(nim, nama, alamat, no_hp, jurusan));
    }
    private static void ubahData(){
        List<Mahasiswa> listMahasiswa = mhs.tampilkanMahasiswa();
        masukan = new Scanner(System.in);
        String nim="", nama="", alamat="", no_hp="", jurusan="", in;
        int anim;
        
        tampilData();
        System.out.print("Masukan NIM yang ingin diubah > ");
        nim = masukan.nextLine();
        anim = mhs.cekGetIndex(new Mahasiswa(nim, null, null, null, null)); 

        if(anim >= 0){
            System.out.println("\nKet: ketik Y / y untuk mengubah data, ketik sembarang untuk tidak mengubah data");
            
            System.out.print("Ubah Nama        ? [Y/y]> ");
            in = masukan.nextLine();
            if(in.equals("Y") || in.equals("y")) {System.out.print("Masukan Nama baru       -->> ");nama = masukan.nextLine();}
            else {nama = listMahasiswa.get(anim).getnama();}
            
            System.out.print("\nUbah Alamat    ? [Y/y]> ");
            in = masukan.nextLine();
            if(in.equals("Y") || in.equals("y")) {System.out.print("Masukan Alamat baru   -->> "); alamat = masukan.nextLine();}
            else {alamat = listMahasiswa.get(anim).getalamat();}

            System.out.print("\nUbah No HP     ? [Y/y]> ");
            in = masukan.nextLine();
            if(in.equals("Y") || in.equals("y")) {System.out.print("Masukan No HP baru    -->> "); no_hp = masukan.nextLine();}
            else {no_hp = listMahasiswa.get(anim).getno_hp();}

            System.out.print("\nUbah jurusan   ? [Y/y]> ");
            in = masukan.nextLine();
            if(in.equals("Y") || in.equals("y")) {System.out.print("Masukan Jurusan baru -->>"); jurusan = masukan.nextLine();}
            else {jurusan = listMahasiswa.get(anim).getjurusan();}

            mhs.ubahmahasiswa(new Mahasiswa(nim, nama, alamat, no_hp, jurusan));

        }else{
            System.out.println("NIM yang anda masukan tidak ada");
        }
    }
    private static void hapusData(){
        masukan = new Scanner(System.in);
        String opsiHapus, indexHapus;
        System.out.println("1. Hapus semua ");
        System.out.println("2. Hapus berdasarkan NIM");
        System.out.print("Pilih salah satu -> ");
        opsiHapus = masukan.nextLine();
        switch(opsiHapus){
            case "1":
                mhs.hapusSemuaMahasiswa();
                break;
            case "2":
                System.out.println();
                tampilData();
                System.out.print("Masukan NIM yang ingin dihapus -> ");
                indexHapus = masukan.nextLine();
                mhs.hapusMahasiswa(new Mahasiswa(indexHapus, null, null, null, null));
                break;
            default:
                System.out.println("Pilihan tidak sesuai dengan daftar");
                break;
        }
    }
    private static void tampilData(){
        List<Mahasiswa> listMahasiswa = mhs.tampilkanMahasiswa();
        int nomer = 1;
        for(Mahasiswa mahasiswa : listMahasiswa){
            System.out.print(nomer + "). ");
            System.out.println("NIM: " + mahasiswa.getnim() + "\tNama: " + mahasiswa.getnama() + 
                            "\tAlamat: " + mahasiswa.getalamat() + "\tNO HP: " + mahasiswa.getno_hp() +
                            "\tJurusan: " + mahasiswa.getjurusan());
            nomer++ ;
        }
    }

}