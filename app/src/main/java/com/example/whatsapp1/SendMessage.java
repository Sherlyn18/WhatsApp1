package com.example.whatsapp1;

import java.util.Map;

public class
SendMessage extends Message {

    private Map hora;


    public SendMessage(String mensaje, String urlFoto, String nombre, String type_mensaje, Map hora) {
        super(mensaje, urlFoto, nombre, type_mensaje);
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}
