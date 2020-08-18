package com.segurosx;

import com.segurosx.models.*;
import com.segurosx.models.patterns.CorreoMediator;
import com.segurosx.models.patterns.PolizaAdapter;
//import com.segurosx.models.patterns.PolizaAdapter2;
import com.segurosx.models.patterns.PolizaAdapter2;

import java.awt.*;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args ) throws AWTException {

        Cliente cliente = new Cliente("Juan Perez");
        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.calcularRiesgo();
        seguro.calcularCobeturaVehicular();
        cliente.setCompraSeguro(seguro);
        System.out.println( seguro.getDetalleSeguro() );


        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        seguro2.setPoliza(new Poliza(122122, "Juan Pablo", "Juan Perez", 12.4));
        cliente.setCompraSeguro(seguro2);
        System.out.println( seguro2.getDetalleSeguro() );

        seguro2.setSumaAsegurada(34.5);
        CorreoMediator contratanteNotificacion = new ContratanteCorreoMediator(seguro2);
        contratanteNotificacion.sendCorreo();


        System.out.println();
        seguro2.getPoliza().imprimir();
         
        IExportable exportable = new PolizaAdapter(seguro2.getPoliza());
        System.out.println( exportable.aXML() +"\n");

        IExportable exportable2 = new PolizaAdapter2(76656, "Juan Perez", "Juan Pablo", 14.6);
        System.out.println( exportable2.aXML() +"\n");


   }
}




