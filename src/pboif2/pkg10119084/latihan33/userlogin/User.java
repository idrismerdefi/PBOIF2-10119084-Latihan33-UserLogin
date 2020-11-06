/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan33.userlogin;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk User Login
 **/
public class User {
    private final String username = "Dandri";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        System.out.println("");
        
        if(status) {
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun ,parUserName);
    }
}