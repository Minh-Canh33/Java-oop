/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;
    
    public Truong(){
        
    }
    
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    
    public String getTen(){
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }
    
    public String toString() {
        return "[ten truong: " + ten + ", dia chi truong: " + diaChi + ", ten hieu truong: " + hieuTruong + "], ";
    }
    
    public static void main(String[] args) {
        Truong t1 = new Truong("1","2","3");
        System.out.println(t1);
    }
}
