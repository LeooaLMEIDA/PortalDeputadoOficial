package com.example.portaldeputadooficial.view;

import static com.example.portaldeputadooficial.util.Global.listaPartidos;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.adapter.AdapterPartido;
import com.example.portaldeputadooficial.model.dto.DadosPartidoDTO;
import java.util.ArrayList;

public class ListaPartidosActivity extends AppCompatActivity {

    ListView lvPartidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_partidos);

        lvPartidos = findViewById(R.id.lvPartidos);
        atualizarGrid(listaPartidos);
    }

    private void atualizarGrid(ArrayList<DadosPartidoDTO> listaPartidos) {
        AdapterPartido adapterPartido = new AdapterPartido(this, listaPartidos);
        lvPartidos.setAdapter(adapterPartido);
        adapterPartido.notifyDataSetChanged();
    }
}
