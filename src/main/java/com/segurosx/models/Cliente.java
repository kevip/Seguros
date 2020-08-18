package com.segurosx.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private List<Seguro> seguros;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<Seguro>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setCompraSeguro(Seguro seguro) {
        // set contratante, observers
        seguro.setCliente(this);

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (Seguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }
        
    }

    public void notifyCliente(Seguro seguro) throws AWTException {
        System.out.println(seguro.getPoliza().armarSalidaTexto());
        Notificacion notificacion = new Notificacion("Cambio de suma asegurada", "Poliza - suma: " + seguro.getPoliza().getSumaAsegurada());
        notificacion.displayTray();
    }
}