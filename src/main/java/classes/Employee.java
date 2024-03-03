/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author EMAN
 */
public class Employee {
    //Attributes
    public int _employeeID;
    private String _firstName;
    private String _lastName;
    private String _role;
    private String _department;
    private String _supervisor;
    private String _status;
    private String _birthday;
    private String _sssNumber;
    private String _pagibigNumber;
    private String _philhealthNumber;
    private String _tinNumber;
    
    //Getter Methods
    public int GetEmployeeID() {
        return _employeeID;
    }
    public String GetFirstName() {
        return _firstName;
    }
    public String GetLastName() {
        return _lastName;
    }
    public String GetRole() {
        return _role;
    }
    public String GetDepartment() {
        return _department;
    }
    public String GetSupervisor() {
        return _supervisor;
    }
    public String GetStatus() {
        return _status;
    }
    public String GetBirthday() {
        return _birthday;
    }
    public String GetSSSNumber() {
        return _sssNumber;
    }
    public String GetPagibigNumber() {
        return _pagibigNumber;
    }
    public String GetPhilhealthNumber() {
        return _philhealthNumber;
    }
    public String GetTinNumber() {
        return _tinNumber;
    }
    
    //Setter Methods
    /*public void SetEmployeeID(int EmployeeID){
        _employeeID = EmployeeID;
    }
    public void SetFirstName(String FirstName){
        _firstName = FirstName;
    }
    public void SetLastName(String LastName){
        _lastName = LastName;
    }
    public void SetRole(String Role){
        _role = Role;
    }
    public void SetDepartment(String Department){
        _department = Department;
    }
    public void SetSupervisor(String Supervisor){
        _supervisor = Supervisor;
    }
    public void SetStatus(String Status){
        _status = Status;
    }
    public void SetBirthday(String Birthday){
        _birthday = Birthday;
    }
    public void SetSSSNumber(String SSSNumber){
        _sssNumber = SSSNumber;
    }
    public void SetPagibigNumber(String PagibigNumber){
        _pagibigNumber = PagibigNumber;
    }
    public void SetPhilhealthNumber(String PhilhealthNumber){
        _philhealthNumber = PhilhealthNumber;
    }
    public void SetTinNumber(String TinNumber){
        _tinNumber = TinNumber;
    }
*/
 
    //constructor
    public Employee(String[] empInfo) {
        this._employeeID = Integer.parseInt(empInfo[0]);
        this._firstName = empInfo[2];
        this._lastName = empInfo[1];
        this._role = empInfo[11];
        this._department = empInfo[12];
        this._supervisor = empInfo[13];
        this._status = empInfo[10];
        this._birthday = empInfo[3];
        this._sssNumber = empInfo[6];
        this._pagibigNumber = empInfo[9];
        this._philhealthNumber = empInfo[7];
        this._tinNumber = empInfo[8];
    }

public static Employee[] readEmployee(String fileEmployee){
    String line = "";
    String csvSplitBy = ",";
    Employee[] title = null;
    BufferedReader br = null;
    
    try{
        br = new BufferedReader(new FileReader(fileEmployee));
        
        br.readLine();//skip header or 1st line sa csv
        int numEmployee = (int)br.lines().count();
        title = new Employee[numEmployee];
        br.close();
        
        br = new BufferedReader(new FileReader(fileEmployee));
        br.readLine();
        
        int index = 0;      
        while((line = br.readLine()) != null) {
        String[] data = line.split(csvSplitBy);
        title[index] = new Employee(data);
        index++;
          
    }
        
    } catch (IOException e){
        e.printStackTrace();
        
    } finally {
        if (br !=null){
            try {
                br.close();
            }
            catch (IOException e){
        e.printStackTrace();
        }
            
    }
}
    return title;
}
}
   

