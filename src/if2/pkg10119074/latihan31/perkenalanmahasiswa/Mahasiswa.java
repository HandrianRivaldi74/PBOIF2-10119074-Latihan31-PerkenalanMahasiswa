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
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalanDiri() {
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
    
}
