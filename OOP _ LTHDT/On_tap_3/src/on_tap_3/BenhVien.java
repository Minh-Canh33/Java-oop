/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;


public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;
    
    public BenhVien(){
        
    }
    
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }
    
    public String toString() {
        return "[ten benh vien: " + ten + ", dia chi o :" + diaChi + ", giam doc :" +giamDoc;
    }
    
    public static void main(String[] args) {
//        BenhVien bv1 = new BenhVien();
//        bv1.setDiaChi("ha noi");
//        bv1.setGiamDoc("phuong beoooo");
//        bv1.setTen("khong biec");
        
//        System.out.println("thong tin benh vien: " + bv1);
//        System.out.println("thong tin dia chi: " + bv1.getDiaChi());
//        System.out.println("thong tin giam doc: " + bv1.getGiamDoc());
//        System.out.println("thong tin ten: " + bv1.getTen());
        BenhVien bv1 = new BenhVien("Ho Chi Minh","Phuong","Beo");
        System.out.println(bv1);
    }
}
