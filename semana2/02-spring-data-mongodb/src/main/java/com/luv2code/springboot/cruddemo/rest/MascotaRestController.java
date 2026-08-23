package com.luv2code.springboot.cruddemo.rest;

import tools.jackson.databind.json.JsonMapper;
import com.luv2code.springboot.cruddemo.entity.Mascota;
import com.luv2code.springboot.cruddemo.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MascotaRestController {

    private MascotaService mascotaService;

    private JsonMapper jsonMapper;

    @Autowired
    public MascotaRestController(MascotaService theMascotaService, JsonMapper theJsonMapper) {
        mascotaService = theMascotaService;
        jsonMapper = theJsonMapper;
    }

    // expose "/mascotas" and return a list of mascotas
    @GetMapping("/mascotas")
    public List<Mascota> findAll() {
        return mascotaService.findAll();
    }

    // add mapping for GET /mascotas/{mascotaId}
    //
    // El mascotaId ahora es String: un ObjectId de MongoDB, no un entero.

    @GetMapping("/mascotas/{mascotaId}")
    public Mascota getMascota(@PathVariable String mascotaId) {

        Mascota theMascota = mascotaService.findById(mascotaId);

        if (theMascota == null) {
            throw new RuntimeException("Mascota id not found - " + mascotaId);
        }

        return theMascota;
    }

    // add mapping for POST /mascotas - add new mascota

    @PostMapping("/mascotas")
    public Mascota addMascota(@RequestBody Mascota theMascota) {

        // also just in case they pass an id in JSON ... set id to null
        // this is to force a save of new item ... instead of update
        //
        // En JPA esto era setId(0). En MongoDB el equivalente es null: si el id
        // viene nulo se inserta un documento nuevo, y si viene con valor se
        // REEMPLAZA el documento que ya existía con ese id.

        theMascota.setId(null);

        Mascota dbMascota = mascotaService.save(theMascota);

        return dbMascota;
    }

    // add mapping for PUT /mascota - update existing mascota

    @PutMapping("/mascotas")
    public Mascota updateMascota(@RequestBody Mascota theMascota) {

        Mascota dbMascota = mascotaService.save(theMascota);

        return dbMascota;
    }

    // add mapping for PATCH /mascotas/{mascotaId} - patch mascota ... partial
    // update

    @PatchMapping("/mascotas/{mascotaId}")
    public Mascota patchMascota(@PathVariable String mascotaId,
            @RequestBody Map<String, Object> patchPayload) {

        // Step 1: Retrieve the existing mascota from database
        Mascota tempMascota = mascotaService.findById(mascotaId);

        if (tempMascota == null) {
            throw new RuntimeException("Mascota id not found - " + mascotaId);
        }

        // Step 2: Security check - prevent ID modifications
        // The ID should never change, so reject any attempts to modify it
        if (patchPayload.containsKey("id")) {
            throw new RuntimeException(
                    "Mascota id cannot be modified. Remove 'id' from request body.");
        }

        // Step 3: Apply the partial update
        // This creates a NEW mascota object with the updates applied
        Mascota patchedMascota = jsonMapper.updateValue(tempMascota, patchPayload);

        // Step 4: Save the updated mascota to database and return it
        Mascota dbMascota = mascotaService.save(patchedMascota);

        return dbMascota;
    }

    // add mapping for DELETE /mascotas/{mascotaId} - delete mascota

    @DeleteMapping("/mascotas/{mascotaId}")
    public String deleteMascota(@PathVariable String mascotaId) {

        Mascota tempMascota = mascotaService.findById(mascotaId);

        // throw exception if null

        if (tempMascota == null) {
            throw new RuntimeException("Mascota id not found - " + mascotaId);
        }

        mascotaService.deleteById(mascotaId);

        return "Deleted mascota id - " + mascotaId;
    }

}
