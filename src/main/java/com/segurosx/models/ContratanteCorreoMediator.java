package com.segurosx.models;

import com.segurosx.models.patterns.CorreoMediator;

import java.awt.*;

public class ContratanteCorreoMediator implements CorreoMediator {

    private Seguro seguro;
    private Certificado certificado;
    private Poliza poliza;
    private Cliente cliente; // contratante


    public ContratanteCorreoMediator(Seguro seguro){
        seguro = seguro;
        certificado = seguro.getCertificado();
        poliza = seguro.getPoliza();
        cliente = seguro.getCliente();
    }

    @Override
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String getMensaje(){
        StringBuffer salida = new StringBuffer();

        salida.append("\n====================================\n");
        salida.append("Mediator Mensaje\n\n\n");
        salida.append("Certificado: " + certificado.getNumero() + "\n\n");
        salida.append("Poliza: " + poliza.armarSalidaTexto() + "\n");
        salida.append("Cliente: " + cliente.getNombre());
        salida.append("\n====================================\n");

        return salida.toString();
    }

    @Override
    public void sendCorreo() {
        String mensaje = getMensaje();
        System.out.println(mensaje);
        // enviando correo...
    }

    @Override
    public void sendNotificacion() {
        String mensaje = getMensaje();
        Notificacion notificacion = new Notificacion("Detalle seguro", mensaje);
        try {
            notificacion.displayTray();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
