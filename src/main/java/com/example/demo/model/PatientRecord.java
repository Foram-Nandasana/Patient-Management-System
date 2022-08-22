package com.example.demo.model;

import javax.persistence.Id;

public class PatientRecord
{

    @Id
    private Integer patientId;
    private String name;
    private String address;


    public PatientRecord(Integer patientId, String name, String address) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
    }

    public PatientRecord() {
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
