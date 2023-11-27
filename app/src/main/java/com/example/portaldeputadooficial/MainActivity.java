package com.example.portaldeputadooficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.portaldeputadooficial.controller.DeputadoController;
import com.example.portaldeputadooficial.controller.PartidoController;
import com.example.portaldeputadooficial.view.ListaDeputadosActivity;
import com.example.portaldeputadooficial.view.ListaPartidosActivity;

public class MainActivity extends AppCompatActivity {

    private Button btVisualizarDeputados;
    private Button btVisualizarPartidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btVisualizarDeputados = findViewById(R.id.btVisualizarDeputados);
        btVisualizarDeputados.setOnClickListener(v -> abrirActivityDeputados());

        DeputadoController.getDeputados();

        btVisualizarPartidos = findViewById(R.id.btVisualizarPartidos);
        btVisualizarPartidos.setOnClickListener(v -> abrirActivityPartidos());

        PartidoController.getPartidos();

    }

    public void abrirActivityDeputados() {
        Intent intent = new Intent(MainActivity.this,
                ListaDeputadosActivity.class);

        startActivity(intent);
    }

    private void abrirActivityPartidos() {
        Intent intent = new Intent(MainActivity.this,
                ListaPartidosActivity.class);

        startActivity(intent);
    }
}