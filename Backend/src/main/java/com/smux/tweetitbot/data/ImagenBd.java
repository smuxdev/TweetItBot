package com.smux.tweetitbot.data;

public class ImagenBd
{
    private String fecha;
    private String explicacion;
    private String titulo;
    private String url;

    public ImagenBd(String fecha, String explicacion, String titulo, String url) {
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

    @Override
    public String toString() {
        return "ImagenBd{" +
                "fecha='" + fecha + '\'' +
                ", explicacion='" + explicacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
