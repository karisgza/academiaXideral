package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.MascotaRepository;
import com.luv2code.springboot.cruddemo.entity.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements MascotaService {

    private MascotaRepository mascotaRepository;

    @Autowired
    public MascotaServiceImpl(MascotaRepository theMascotaRepository) {
        mascotaRepository = theMascotaRepository;
    }

    @Override
    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findById(int theId) {
        Optional<Mascota> result = mascotaRepository.findById(theId);

        Mascota theMascota = null;

        if (result.isPresent()) {
            theMascota = result.get();
        }
        else {
            // we didn't find the mascota
            throw new RuntimeException("Did not find mascota id - " + theId);
        }

        return theMascota;
    }

    @Override
    public Mascota save(Mascota theMascota) {
        return mascotaRepository.save(theMascota);
    }

    @Override
    public void deleteById(int theId) {
        mascotaRepository.deleteById(theId);
    }
}






