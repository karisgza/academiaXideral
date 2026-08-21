package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Mascota;
import com.luv2code.springboot.cruddemo.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    // Antes se inyectaba MascotaDAO. Ahora es el repositorio de Spring Data,
    // que no tiene implementación escrita a mano.
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
    public Mascota findById(String theId) {

        // findById() devuelve Optional<Mascota>. Lo convertimos a null para
        // conservar el mismo contrato que tenía la versión con JPA: el
        // controlador sigue comprobando "if (tempMascota == null)".
        return mascotaRepository.findById(theId).orElse(null);
    }

    // Ojo: aquí ya no hay @Transactional.
    //
    // MongoDB en modo standalone (un contenedor suelto, sin replica set) no
    // soporta transacciones multi-documento. Y no hacen falta: cada operación
    // toca un solo documento, y MongoDB garantiza atomicidad por documento.
    @Override
    public Mascota save(Mascota theMascota) {
        return mascotaRepository.save(theMascota);
    }

    @Override
    public void deleteById(String theId) {
        mascotaRepository.deleteById(theId);
    }
}
