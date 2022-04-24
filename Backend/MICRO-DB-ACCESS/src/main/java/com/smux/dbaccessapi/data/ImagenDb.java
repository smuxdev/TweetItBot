package com.smux.dbaccessapi.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("imagenDb")
public class ImagenDb {
    @Id
    private String id;
    private String fecha;
    private String explicacion;
    private String titulo;
    private String url;

    public ImagenDb() {}
    public ImagenDb(String fecha, String explicacion, String titulo, String url) {
        this.fecha = fecha;
        this.explicacion = explicacion;
        this.titulo = titulo;
        this.url = url;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    @Override
    public String toString() {
        return "ImagenBd{" +
                "id=" + id + '\'' +
                "fecha='" + fecha + '\'' +
                ", explicacion='" + explicacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
