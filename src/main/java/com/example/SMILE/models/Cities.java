package com.example.SMILE.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")

public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cities")
    private Long id;
    @Column(name = "dni")
    private String dni;
    @Column(name = "cities")
    private String cities;
    
    public Cities() {
    }

    public Cities(String dni, String cities) {
        this.dni = dni;
        this.cities = cities;
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
    public String getCities() {
        return cities;
    }
    public void setCities(String cities) {
        this.cities = cities;
    }
}
