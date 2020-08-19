package com.segurosx.models;

import com.segurosx.models.patterns.ICorreoMediator;

import java.awt.*;

public class CorreoMediator implements ICorreoMediator {

    private String servidorSMTP;

    @Override
    public void setServidorCorreoSMTP(String servidorIP) {
        
        this.servidorSMTP = servidorIP;
    }

    private String preparaMensaje(String nombre)  {
        final StringBuffer salida = new StringBuffer();

        salida.append("\n================================================================\n");
        salida.append(" Mediator envia mensaje por Correo, servidor IP: "+ servidorSMTP );
        salida.append("\n                                    Cliente: "+ nombre );
        salida.append("\n================================================================\n");

        return salida.toString();
    }

    @Override
    public void enviaCorreoSMTP(Cliente cliente) {

        // enviando correo...
        System.out.println(  preparaMensaje(cliente.getNombre()) );
        
    }
    
}
