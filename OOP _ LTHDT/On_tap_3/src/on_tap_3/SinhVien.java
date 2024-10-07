/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;
    
    public SinhVien() {
    }


    public SinhVien( String ten, int tuoi, char gioiTinh,String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + super.toString() + '}';
    }

    
    public static void main(String[] args) {
        Truong t1 = new Truong("1","2","3");
        SinhVien sv1 = new SinhVien("canh",20,'N',"lop phuong","ktpm",t1);
        System.out.println(sv1);
    }
    
    
}
