package br.ucsal.edu.anotacoes.dao;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.edu.anotacoes.model.Evento;

public class EventoDAO {

    private final static List<Evento> evento = new ArrayList<>();

    public void salvar(Evento eventoCriado) {
        evento.add(eventoCriado);
    }

    public List<Evento> todos() {
        return new ArrayList<>(evento);
    }
}
