package com.smux.tweetitbot.controllers;

import com.smux.tweetitbot.data.ImagenBd;
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
    public List<ImagenBd> getSavedImages(@RequestParam(value = "number", defaultValue = "3") String number) {
        List<ImagenBd> imagenes = Arrays.asList(new ImagenBd("12/12/2022", "Una explicación", "Un título", " Una URL"),
                new ImagenBd("15/15/2022", "Una explicación 2", "Un título 2", " Una URL 2"));
        // TODO: Consultar, vía Kafka, del servicio de consulta de BD

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
