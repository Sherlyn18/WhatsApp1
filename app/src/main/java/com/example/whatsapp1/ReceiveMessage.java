package com.example.whatsapp1;

public class ReceiveMessage extends Message {

    private Long hora;


    public ReceiveMessage(String mensaje, String urlFoto, String nombre, String type_mensaje) {
        super(mensaje, urlFoto, nombre, type_mensaje);
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
        this.hora = hora;
    }
}
