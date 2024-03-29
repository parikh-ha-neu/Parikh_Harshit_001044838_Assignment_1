/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Harshit
 */
public class Profile {
    public String name;
    public String address;
    public Date date_of_birth = new Date(0);
    public long telephone_number;
    public long fax_number;
    public String email_address;
    public long ssn;
    public long medical_record_number;
    public long bank_account_number;
    public long license_number;
    public String vehicle_identifier_number;
    public String device_identifier;
    public String linkedin;
    public String ip_address;
    public String photo;
    public String fingerprint;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(long telephone_number) {
        this.telephone_number = telephone_number;
    }

    public long getFax_number() {
        return fax_number;
    }

    public void setFax_number(long fax_number) {
        this.fax_number = fax_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getMedical_record_number() {
        return medical_record_number;
    }

    public void setMedical_record_number(long medical_record_number) {
        this.medical_record_number = medical_record_number;
    }

    public long getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(long bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public long getLicense_number() {
        return license_number;
    }

    public void setLicense_number(long license_number) {
        this.license_number = license_number;
    }

    public String getVehicle_identifier_number() {
        return vehicle_identifier_number;
    }

    public void setVehicle_identifier_number(String vehicle_identifier_number) {
        this.vehicle_identifier_number = vehicle_identifier_number;
    }

    public String getDevice_identifier() {
        return device_identifier;
    }

    public void setDevice_identifier(String device_identifier) {
        this.device_identifier = device_identifier;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
    
    
    
    
}