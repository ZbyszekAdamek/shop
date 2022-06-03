package com.example.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "participants")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Long id;

    private String name;

    private String surname;

    private int quantityOfDays;

    private char type;
    public Participant() {
    }

    public Participant(Long id, String name, String surname, int quantityOfDays, char type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.quantityOfDays = quantityOfDays;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getQuantityOfDays() {
        return quantityOfDays;
    }

    public void setQuantityOfDays(double quantityOfDays) {
        this.quantityOfDays = (int) quantityOfDays;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
