/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_maven;

/**
 *
 * @author A-28
 */
public class Dealer {
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }

    Dealer(String info_mobil, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}

