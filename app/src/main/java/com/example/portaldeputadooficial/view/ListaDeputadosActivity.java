package com.example.portaldeputadooficial.view;

import static com.example.portaldeputadooficial.util.Global.listaDeputados;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.adapter.AdapterDeputado;
import com.example.portaldeputadooficial.model.dto.DadosDeputadoDTO;

import java.util.ArrayList;

public class ListaDeputadosActivity extends AppCompatActivity {

    ListView lvDeputados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_deputados);

        lvDeputados = findViewById(R.id.lvDeputados);
        atualizarGrid(listaDeputados);

    }

    private void atualizarGrid(ArrayList<DadosDeputadoDTO> listaDeputados) {
        AdapterDeputado adapterDeputado = new AdapterDeputado(this, listaDeputados);
        lvDeputados.setAdapter(adapterDeputado);
        adapterDeputado.notifyDataSetChanged();
    }
}
