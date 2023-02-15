package com.example.SMILE.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "treatments")
public class Treatments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treatments")
    private Long id;
    @Column(name = "dni")
    private String dni;
    @Column(name = "treatments")
    private String treatments;

    public Treatments(String dni, String treatments) {
        this.dni = dni;
        this.treatments = treatments;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTreatments() {
        return treatments;
    }
    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }
}
