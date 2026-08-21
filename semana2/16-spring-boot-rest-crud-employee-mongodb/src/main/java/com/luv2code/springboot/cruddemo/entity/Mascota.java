package com.luv2code.springboot.cruddemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mascotas")
public class Mascota {

    // define fields
    //
    // El id es String, no int: MongoDB genera un ObjectId (hexadecimal de 24
    // caracteres). No lleva @GeneratedValue — el driver lo asigna al insertar.
    @Id
    private String id;

    // Sin @Column: MongoDB no tiene esquema, así que el campo del documento se
    // llama igual que la propiedad Java. No hay nada que mapear.
    private String nombre;

    private String raza;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
