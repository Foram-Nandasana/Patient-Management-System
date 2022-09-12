package com.example.demo.controller;

import com.example.demo.model.PatientRecord;
import com.example.demo.repository.PatientRecordRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping
    public String getWelcomeMessage(){
        return ("<h1> Welcome !!</h1>");
    }
    @GetMapping("/patient")
    public List<PatientRecord> getAllPatientRecord()
    {
        return patientRecordRepository.findAll();
    }


    @GetMapping("/patient/{patientId}")
    public PatientRecord getPatientRecord(@PathVariable long id)
    {
        return patientRecordRepository.findById(id).get();
    }

    @PostMapping("/addpatient")
    public List<PatientRecord> addPatientRecord(@RequestBody PatientRecord patientRecord) {
        patientRecordRepository.save(patientRecord);
        return patientRecordRepository.findAll();
    }

    @PutMapping("/patient/{patientId}")
    public List<PatientRecord> updatePatientRecord(@RequestBody PatientRecord patientRecord, @PathVariable long id)
    {
        PatientRecord patientobj = patientRecordRepository.findById(id).get();
        patientobj.setName(patientRecord.getName());
        patientobj.setAddress(patientRecord.getAddress());
        patientRecordRepository.save(patientobj);
        return patientRecordRepository.findAll();
    }

    @DeleteMapping("/patient/{patientId}")
    public List<PatientRecord> deletePatientRecord(@PathVariable long id) {
        patientRecordRepository.delete(patientRecordRepository.findById(id).get());
        return patientRecordRepository.findAll();
    }
}
