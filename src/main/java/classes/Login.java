/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author EMAN
 */
public class Login {
    //Attributes
    private String _username;
    private String _password;
    private String _role;
    
    //Setter Method only; No Getter method as its only purpose is to validate login credentials
    public void SetUsername(String Username) {
        _username = Username;
    }
    public void SetPassword(char[] Password){
        _password = new String(Password);
    }

    public void setRole(String _role) {
        this._role = _role;
    }
    
    
    
    //Getter Method (for verification and matching of employee ID)
    public String getUsername()  {    
        return _username; 
    }

    public String getPassword() {
        return _password;
    }
    
    public String getRole() {
        return _role;
    }
    
    
    // Constructor
    public Login(String[] accInfo) {
        this._username = accInfo[0];
        this._password = accInfo[1];
        this._role = accInfo[2];
    }
    
    
    //For reading of Users.csv
    public static Login[] readAccount(String fileAccount) {
        String line = "";
        String csvSplitBy = ",";
        Login[] accounts = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileAccount));

            br.readLine(); // skip header or 1st line sa csv

            // Count number of lines excluding header
            int numAccounts = (int) br.lines().count(); // + 1; // Add 1 to include header
            accounts = new Login[numAccounts];
            br.close();

            // Reinitialize BufferedReader to read from the beginning
            br = new BufferedReader(new FileReader(fileAccount));
            br.readLine(); // Skip header line

            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length >= 3) { // Ensure data contains username, password, and role
                    accounts[index] = new Login(data);
                    index++;
                } else {
                    // Handle invalid data format
                    System.err.println("Invalid data format for user: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return accounts;
        }
    
    //Method for adding or writing employee record in the csv file
    public void AddAccount(String CSVFilename) throws IOException {
    try (CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
        String[] accountRecord = new String[4];
        accountRecord[0] = _username;
        accountRecord[1] = _password;
        accountRecord[2] = _role;
        writer.writeNext(accountRecord);
    }
}

    //Method for Login Verification
    public boolean verifyLogin() {
        File file = new File("src\\main\\java\\files\\Users.csv");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length >= 2 && parts[0].equals(_username)) {
                        return parts[1].equals(_password);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
    }
    }

