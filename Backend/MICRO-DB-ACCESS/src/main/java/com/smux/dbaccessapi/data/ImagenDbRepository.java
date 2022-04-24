package com.smux.dbaccessapi.data;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ImagenDbRepository extends MongoRepository<ImagenDb, String> {

    public ImagenDb findByTitulo(String titulo);
    public List<ImagenDb> findByfecha(String fecha);

}