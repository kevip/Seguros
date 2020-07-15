package com.segurosx.models;

import java.util.ArrayList;
import java.util.List;

public class Poliza {

    private Integer numero;
    private String nombresAsegurado;
    private String nombresTomador;
    private List<String> nombresBeneficiarios;

    public Poliza(Integer numero, String nombresAsegurado, String nombresTomador)   {

        this.numero = numero;
        this.nombresAsegurado = nombresAsegurado;
        this.nombresTomador = nombresTomador;
        this.nombresBeneficiarios = new ArrayList<String>();
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombresAsegurado() {
        return nombresAsegurado;
    }

    public void setNombresAsegurado(String nombresAsegurado) {
        this.nombresAsegurado = nombresAsegurado;
    }

    public String getNombresTomador() {
        return nombresTomador;
    }

    public void setNombresTomador(String nombresTomador) {
        this.nombresTomador = nombresTomador;
    }

    public String armarSalidaTexto()    {

        StringBuffer salida = new StringBuffer();
        salida.append("Formato Estandar\n");
        salida.append("-------------------------\n");
        salida.append("Poliza numero: [" + this.numero + "]\n");
        salida.append("Nombres Asegurado: [" + this.nombresAsegurado + "]\n");
        salida.append("Nombres Tomador: [" + this.nombresTomador + "]\n");
        salida.append("-------------------------\n");   

        return salida.toString();
    }

    public void imprimir()  {

        System.out.println(armarSalidaTexto());
    }
}