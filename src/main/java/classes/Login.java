/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author EMAN
 */
public class Login {
    //Attributes
    private String _username;
    private String _password;
    
    //Setter Method only; No Getter method as its only purpose is to validate login credentials
    public void SetUsername(String Username) {
        _username = Username;
    }
    public void SetPassword(char[] Password){
        _password = new String(Password);
    }
    
    //Getter Method (for verification and matching of employee ID)
    public String getUsername()  {    
        return _username; 
    }

    //Method for Login Verification
    public boolean verifyLogin() throws FileNotFoundException, IOException, CsvValidationException {
        String csvFilename = "C:\\Users\\DREAM PC\\Documents\\NetBeansProjects\\PayrollSystemMaven\\src\\main\\java\\files\\Users.csv";
        try(CSVReader reader = new CSVReader(new FileReader(csvFilename))) {
            String[] line;
            while((line = reader.readNext()) !=null) {
                if(line[0].equals(_username)) {
                    return line[1].equals(_password); //'.equals' is used for comparison of strings, '==' only works for numerical values
                }
            }
        }
        return false; //means username and password are not authenticated
    }
    }

