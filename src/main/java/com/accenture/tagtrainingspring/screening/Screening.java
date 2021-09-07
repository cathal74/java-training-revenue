package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {

    private Integer screeningId;

    private Patient patient;

    private LocalDate DateOfScreening;

    private boolean malignant;

    public Screening(Integer screeningId, Patient patient, LocalDate dateOfScreening, boolean malignant) {
        this.screeningId = screeningId;
        this.patient = patient;
        DateOfScreening = dateOfScreening;
        this.malignant = malignant;
    }

    public Integer getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Integer screeningId) {
        this.screeningId = screeningId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDateOfScreening() {
        return DateOfScreening;
    }

    public void setDateOfScreening(LocalDate dateOfScreening) {
        DateOfScreening = dateOfScreening;
    }

    public boolean isMalignant() {
        return malignant;
    }

    public void setMalignant(boolean malignant) {
        this.malignant = malignant;
    }
}


