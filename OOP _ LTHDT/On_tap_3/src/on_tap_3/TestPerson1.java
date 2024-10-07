/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class TestPerson1 {
    public static void main(String[] args) {
//        Person1 person1 = new Person1();
//        person1.setName("Nguyen Van A");
//        person1.setPhone("0123456789");
//        System.out.println("Thông tin person1:");
//        System.out.println(person1);
//
//        // Tạo đối tượng Person bằng constructor có tham số
//        Person1 person2 = new Person1("Le Thi B", "01/01/1990", "Ha Noi", 'F', "lethi@example.com", "0987654321");
//        System.out.println("\nThông tin person2:");
//        System.out.println(person2);
        
        DiaChi dc1 = new DiaChi("boi khe","chuyen my","phu xuyen","ha noi");
        System.out.println("dia chi la: \n" + dc1);
        dc1.setHuyen("PHU XUYEN");
        System.out.println(dc1);
        System.out.println(dc1.getHuyen());
        
    }
}
