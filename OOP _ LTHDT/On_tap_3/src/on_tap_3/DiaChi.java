/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    
    public DiaChi(){
        
    }
    
    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }
    
    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    
    public void setThon(String thon) {
        this.thon = thon;
    }
    
    public void setXa(String xa) {
        this.xa = xa;
    }
    public void setHuyen(String huyen) {
        this.huyen = huyen; 
    }
    
    public String getThon(){
        return thon;
    }

    public String getXa() {
        return xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public String getTinh() {
        return tinh;
    }
    
    public String toString(){
        return "thon: " + thon + ", xa: " + xa + ", huyen: " + huyen + ", tinh: " + tinh;
    }
    
    public static void main(String[] args) {
        DiaChi address = new DiaChi("boi khe","chuyen my","phu xuyen","ha noi");
    }
}
