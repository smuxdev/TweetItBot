package com.smux.dbaccessapi.controllers;

import com.smux.dbaccessapi.data.ImagenDb;
import com.smux.dbaccessapi.data.ImagenDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class DbAccessApiControler
{
    @Autowired
    private ImagenDbRepository repository;

    /**
     *
     * @param number: número de imágenes a recuperar
     * @return Lista de imágenes almacenadas en la BD
     */
    @GetMapping("/getImagesFromDb")
    public List<ImagenDb> getImagesFromDb(@RequestParam(value = "number", defaultValue = "3") String number) {
        //List<ImagenDb> imagenes = Arrays.asList(new ImagenDb("12/12/2022", "Una explicación", "Galaxia", " Una URL"), new ImagenDb("15/15/2021", "Una explicación extra", "Sistema Solar", " Una URL u otra"));
        // TODO: Consultar, vía Kafka, del servicio de consulta de BD

        /*repository.deleteAll();
        repository.save(new ImagenDb("12/12/2022", "Una explicación", "Galaxia", " Una URL"));
        repository.save(new ImagenDb("15/15/2021", "Una explicación extra", "Sistema Solar", " Una URL u otra"));*/

        // Consulta a BD (Mongo)
        List<ImagenDb> imagenes = repository.findAll();
        return imagenes;
    }

    /*@PostMapping(value = "/inserImage", accept = "application/json", produces = "application/json")
    public String postTweet() {
        // TODO: Comprobar que la imagen del día no ha sido ya tweeteada consultado al servicio que accede a la BD
        // TODO: Insertar la imagen pasada como parámetro

        return "{'todo': 'TODO'}";
    }*/
}
