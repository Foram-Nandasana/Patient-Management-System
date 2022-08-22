package com.example.demo.controller;

import com.example.demo.model.PatientRecord;
import com.example.demo.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping("/patient")
    public List<PatientRecord> getAllPatientRecord()
    {
        return patientRecordRepository.findAll();
    }

    @GetMapping("/patient/{patientId}")
    public PatientRecord getPatientRecord(@PathVariable Integer id)
    {
        return patientRecordRepository.findById(id).get();
    }

    @PostMapping("/addpatient")
    public List<PatientRecord> addPatientRecord(@RequestBody PatientRecord patientRecord) {
        patientRecordRepository.save(patientRecord);
        return patientRecordRepository.findAll();
    }

    @PutMapping("/patient/{patientId}")
    public List<PatientRecord> updatePatientRecord(@RequestBody PatientRecord student, @PathVariable Integer id)
    {
        PatientRecord studentObj = patientRecordRepository.findById(id).get();
        studentObj.setName(student.getName());
        studentObj.setAddress(student.getAddress());
        patientRecordRepository.save(studentObj);
        return patientRecordRepository.findAll();
    }

    @DeleteMapping("/patient/{patientId}")
    public List<PatientRecord> deletePatientRecord(@PathVariable Integer id) {
        patientRecordRepository.delete(patientRecordRepository.findById(id).get());
        return patientRecordRepository.findAll();
    }
}
