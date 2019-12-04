package com.example.versiones.utils;

public class Version {
    String nombre, numeroDeVersion, fecha, descripcion;
    int logo;

    public Version(String nombre, String numeroDeVersion, String fecha, String descripcion, int logo) {
        this.nombre = nombre;
        this.numeroDeVersion = numeroDeVersion;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeVersion() {
        return numeroDeVersion;
    }

    public void setNumeroDeVersion(String numeroDeVersion) {
        this.numeroDeVersion = numeroDeVersion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
