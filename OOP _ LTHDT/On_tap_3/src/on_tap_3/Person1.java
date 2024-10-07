/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class Person1 {

     private String name;
    private String dob;   // ngày sinh
    private String pob;   // nơi sinh
    private char gender;  // 'M' cho nam và 'F' cho nữ
    private String email;
    private String phone;

    public Person1() {
    }

    public Person1(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person1{" + "name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    public static void main(String[] args) {
         // Tạo đối tượng Person bằng constructor không tham số
        Person1 person1 = new Person1();
        person1.setName("Nguyen Van A");
        person1.setPhone("0123456789");
        System.out.println("Thông tin person1:");
        System.out.println(person1);

        // Tạo đối tượng Person bằng constructor có tham số
        Person1 person2 = new Person1("Le Thi B", "01/01/1990", "Ha Noi", 'F', "lethi@example.com", "0987654321");
        System.out.println("\nThông tin person2:");
        System.out.println(person2);
    }
    
}
