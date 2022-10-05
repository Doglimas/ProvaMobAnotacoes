package br.ucsal.edu.anotacoes.model;

import androidx.annotation.NonNull;
public class Evento {

    private final String nomeEvento;
    private final String dataEvento;
    private final String horaEvento;
    private final String temaEvento;

    public Evento(String nomeEvento, String dataEvento, String horaEvento, String temaEvento) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.horaEvento = horaEvento;
        this.temaEvento = temaEvento;
    }

    @NonNull
    @Override
    public String toString(){
        String format = "Evento: " + nomeEvento + "; Data: " + dataEvento + "; Horário: " + horaEvento + "; Tema: " + temaEvento;
        return format;
    }
}
