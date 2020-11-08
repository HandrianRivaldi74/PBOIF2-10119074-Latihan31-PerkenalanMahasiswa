/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Acer
 * NAMA     : HANDRIAN RIVALDI
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Indra Tiola";
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tansil Ganefi";
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "101190269";
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        
        mahasiswa1.perkenalanDiri();
        mahasiswa2.perkenalanDiri();
        mahasiswa3.perkenalanDiri();
        mahasiswa4.perkenalanDiri();
    }
    
}
