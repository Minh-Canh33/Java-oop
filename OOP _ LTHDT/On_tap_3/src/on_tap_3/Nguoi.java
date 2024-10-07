/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;
    
    public Nguoi(){
        
    }
    
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public String getTen(){
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
    
    public static void main(String[] args) {
        Nguoi man = new Nguoi("phuong beo",(int) 19,'F');
        System.out.println(man);
    }
}
