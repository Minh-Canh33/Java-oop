package on_tap_3;


public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;
    
    public NhanVien() {
        
    }
    
    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;

    }
    
    public void setAddress(DiaChi address) {
        this.address = address;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public DiaChi getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }
    
    public String toString() {
        return "[ten nhan vien :" + name + ", dia chi: " + address + ", ngay sinh: " + dob + ", gioi tinh: " + gender ;
    }
    
    public static void main(String[] args) {
        DiaChi addr = new DiaChi("boi khe ", "chuyen my","phu xuyen","ha noi");
        NhanVien a1 = new NhanVien("phuong beo",addr,"16/12/2005",'f');
        System.out.println(a1);
    }
}
