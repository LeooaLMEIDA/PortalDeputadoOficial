package com.example.portaldeputadooficial.view;

import static com.example.portaldeputadooficial.util.Global.listaDespesas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.adapter.AdapterDespesa;
import com.example.portaldeputadooficial.model.dto.DadosDespesaDTO;

import java.util.ArrayList;

public class DespesaActivity extends AppCompatActivity {
    
    private ListView lvDespesas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesa);
        
        lvDespesas = findViewById(R.id.lvDespesas);
        atualizarGrid(listaDespesas);
    }

    private void atualizarGrid(ArrayList<DadosDespesaDTO> listaDespesas) {
        AdapterDespesa adapterDespesa = new AdapterDespesa(this,listaDespesas);
        lvDespesas.setAdapter(adapterDespesa);
    }
}