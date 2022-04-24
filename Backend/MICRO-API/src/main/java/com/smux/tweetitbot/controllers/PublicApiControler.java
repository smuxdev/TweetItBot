package com.smux.tweetitbot.controllers;

import com.smux.tweetitbot.data.ImagenDb;
import com.smux.tweetitbot.data.ImagenDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PublicApiControler
{
    /**
     *
     * @param number: número de imágenes a recuperar
     * @return Lista de imágenes almacenadas en la BD
     */
    @GetMapping("/savedImages")
    public List<ImagenDb> getSavedImages(@RequestParam(value = "number", defaultValue = "3") String number) {
        //List<ImagenDb> imagenes = Arrays.asList(new ImagenDb("12/12/2022", "Una explicación", "Galaxia", " Una URL"), new ImagenDb("15/15/2021", "Una explicación extra", "Sistema Solar", " Una URL u otra"));
        // TODO: Consultar, vía Kafka, del servicio de consulta de BD

        List<ImagenDb> imagenes;

        return imagenes;
    }

    @PostMapping(value = "/postTweet", produces = "application/json")
    public String postTweet() {
        // TODO: Comprobar que la imagen del día no ha sido ya tweeteada consultado al servicio que accede a la BD
        // TODO: Consumir la API de la NASA para consultar la imagen del día
        //  https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY

        // TODO: Invocar, vía Kafka, al servicio que haga la actualización en BD

        return "{'todo': 'TODO'}";
    }
}
