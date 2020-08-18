package com.segurosx.models;

import java.awt.*;
import java.util.Random;

public abstract class Seguro {

    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected Cliente cliente; // contratante
    protected String nivelRiesgo = "NINGUNO";
    protected String bancoTarjeta;
    protected String marca;
    protected String modelo;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public abstract String getDetalleSeguro();

    public void setSumaAsegurada(Double suma) throws AWTException {
        this.poliza.setSumaAsegurada(suma);
        // notify contratante
        this.cliente.notifyCliente(this);
    }

}
