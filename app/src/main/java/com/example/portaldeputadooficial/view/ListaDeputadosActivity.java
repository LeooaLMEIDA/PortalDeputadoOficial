package com.example.portaldeputadooficial.view;

import static com.example.portaldeputadooficial.util.Global.listaDeputados;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.portaldeputadooficial.MainActivity;
import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.adapter.AdapterDeputado;
import com.example.portaldeputadooficial.controller.DeputadoController;
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

        lvDeputados.setOnItemClickListener((adapterView, view, i, l) -> {
            DadosDeputadoDTO dadosDeputadoDTO = (DadosDeputadoDTO) lvDeputados.getItemAtPosition(i);
            exibeDespesaDeputado(dadosDeputadoDTO.getId());
            abrirActivityDespesas();
        });
    }

    private void atualizarGrid(ArrayList<DadosDeputadoDTO> listaDeputados) {
        AdapterDeputado adapterDeputado = new AdapterDeputado(this, listaDeputados);
        lvDeputados.setAdapter(adapterDeputado);
        adapterDeputado.notifyDataSetChanged();
    }

    private void exibeDespesaDeputado(long id) {
        DeputadoController.getDespesa(id);
    }

    private void abrirActivityDespesas() {
        Intent intent = new Intent(this,
                DespesaActivity.class);

        startActivity(intent);
    }

}
