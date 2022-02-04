package com.idat.microserviciopizza.model;

public class Cliente {

    private Long idCliente;

    private String nombreCliente;


    private String apellidoCliente;


    private String nroCelularCliente;

    private String sedeCliente;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNroCelularCliente() {
        return nroCelularCliente;
    }

    public void setNroCelularCliente(String nroCelularCliente) {
        this.nroCelularCliente = nroCelularCliente;
    }

    public String getSedeCliente() {
        return sedeCliente;
    }

    public void setSedeCliente(String sedeCliente) {
        this.sedeCliente = sedeCliente;
    }
}
