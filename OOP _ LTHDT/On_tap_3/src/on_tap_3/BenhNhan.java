/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhvien;

    public BenhNhan() {
    }

    public BenhNhan(String ten,int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhvien) {
        super(ten,tuoi,gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhvien = benhvien;
    }
    
    public BenhNhan(BenhVien benhvien) {
        this.benhvien = benhvien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhvien(BenhVien benhvien) {
        this.benhvien = benhvien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhvien() {
        return benhvien;
    }


    @Override
    public String toString() {
        return "BenhNhan{" + "tien Su=" + tienSu + ", chann doan=" + chanDoan + ", benh vien=" + benhvien +"\n "+ super.toString() + '}';
    }
    
    
    
    public static void main(String[] args) {
        BenhVien bv1 = new BenhVien("Ho Chi Minh","Phuong","Beo");
        System.out.println(bv1);
        BenhNhan bn1 = new BenhNhan("canh",20,'N',"tien su khong co","cam cum",bv1);
        System.out.println(bn1);
    }
    
}
