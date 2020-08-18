package com.segurosx.models.patterns;

import com.segurosx.models.Seguro;

public interface CorreoMediator {

    void setSeguro(Seguro seguro);
    String getMensaje();
    void sendCorreo();
    void sendNotificacion();

}
