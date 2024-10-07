/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;
    
    public PartTimeEmployee(){
        
    }

    public PartTimeEmployee(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(int hoursPerWeek, String employerName, String dateHired) {
        super(employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(int hoursPerWeek, String employerName, String dateHired, String name, int age, char gender) {
        super(employerName, dateHired, name, age, gender);
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "hoursPerWeek= " + hoursPerWeek + ", " + super.toString() + '}';
    }
    
     
}
