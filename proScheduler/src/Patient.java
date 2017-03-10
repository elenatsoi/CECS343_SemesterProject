/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 014944954
 */
public class Patient extends Person
{
    private String patientID;
    private String status;
 
    //constructor
    public Patient(String lName, String fName, String address, String zCode, 
        String dob, String phone, String email, String patientI, String stat)
    {
        super(lName, fName, address, zCode, dob, phone, email);
        patientID = patientI; 
        status= stat;
    
    } 
    //getteres
    public String getPatientID()
    {
        return patientID;
    }
    public String getStatus()
    {
        return status;
    }   

    //setters
    public void setPatientID(String patientI)
    {
        patientID = patientI;
    }
    public void setStatus(String stat)
    {
        status  = stat;
    } 
}