package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mascota")
public class Mascota {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="raza")
    private String raza;

    @Column(name="edad")
    private int edad;


    // define constructors
    public Mascota() {

    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setLastName(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // define toString
    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}








