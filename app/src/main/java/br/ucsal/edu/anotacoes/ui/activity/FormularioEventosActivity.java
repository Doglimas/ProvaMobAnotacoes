package br.ucsal.edu.anotacoes.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import br.ucsal.edu.anotacoes.R;
import br.ucsal.edu.anotacoes.dao.EventoDAO;
import br.ucsal.edu.anotacoes.model.Evento;

public class FormularioEventosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_eventos);

        final EventoDAO dao = new EventoDAO();

        final EditText campoNomeEvento = findViewById(R.id.activit_formulario_nome_evento);
        final EditText campoDataEvento = findViewById(R.id.activit_formulario_data_evento);
        final EditText campoHoraEvento = findViewById(R.id.activit_formulario_hora_evento);
        final EditText campoTemaEvento = findViewById(R.id.activit_formulario_tema_evento);


        Button botaoSalvar = findViewById(R.id.activit_formulario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeEvento = campoNomeEvento.getText().toString();
                String dataEvento = campoDataEvento.getText().toString();
                String horaEvento = campoHoraEvento.getText().toString();
                String temaEvento = campoTemaEvento.getText().toString();

                Evento eventoCriado = new Evento(nomeEvento,dataEvento,horaEvento,temaEvento);
                dao.salvar(eventoCriado);

                startActivity(new Intent(FormularioEventosActivity.this, ListaEventosActivity.class));
            }
        });
    }

}