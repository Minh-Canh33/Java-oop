/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap_3;

/**
 *
 * @author Admin
 */
public class Employee extends Person {
    private String employerName;
    private String dateHired;
    
    public Employee(){
        
    }
    
    public Employee(String employerName, String dateHired) {
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public Employee(String employerName, String dateHired, String name, int age, char gender) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "employerName= " + employerName + ", dateHired= " + dateHired +"\n " +super.toString() + '}';
    }
    
    
            
    
}
