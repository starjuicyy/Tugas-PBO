/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author Bintang
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        
        hp.hidupkan();
        hp.LakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}
