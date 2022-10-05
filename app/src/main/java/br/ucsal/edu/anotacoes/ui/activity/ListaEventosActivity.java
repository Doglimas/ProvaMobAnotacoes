package br.ucsal.edu.anotacoes.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.ucsal.edu.anotacoes.R;
import br.ucsal.edu.anotacoes.dao.EventoDAO;
import br.ucsal.edu.anotacoes.model.Evento;


public class ListaEventosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos);

        EventoDAO dao = new EventoDAO();

        setTitle("Lista de Eventos");

        FloatingActionButton botaoNovoEvento = findViewById(R.id.activity_main_criar_eventos);
        botaoNovoEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaEventosActivity.this,FormularioEventosActivity.class));
            }
        });

        ListView listadeEventos = findViewById(R.id.activity_main_lista_eventos);
        listadeEventos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, dao.todos()));
    }
}
