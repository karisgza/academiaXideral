package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Mascota;

import java.util.List;

public interface MascotaService {

    List<Mascota> findAll();

    Mascota findById(String theId);

    Mascota save(Mascota theMascota);

    void deleteById(String theId);

}
