/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 014944954
 */
public class Employee extends Person
{
    private String username;
    private String password;
 
    //constructor
    public Employee(String lName, String fName, String address, String zCode, 
        String dob, String phone, String email, String userN, String passW)
    {
        super(lName, fName, address, zCode, dob, phone, email);
        username = userN;
        password = passW;
    
    } 
    //getteres
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }   

    //setters
    public void setUsername(String userN)
    {
        username = userN;
    }
    public void setPassword(String passW)
    {
        password  = passW;
    } 
     
}
