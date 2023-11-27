package com.example.portaldeputadooficial.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.model.dto.DadosPartidoDTO;

import java.util.ArrayList;

public class AdapterPartido extends BaseAdapter {
    private Context context;
    private ArrayList<DadosPartidoDTO> listaPartidos;

    public  Context getContext(){
        return context;
    }

    public ArrayList<DadosPartidoDTO> getListaPartidos(){
        return listaPartidos;
    }

    public AdapterPartido(Context context, ArrayList<DadosPartidoDTO> listaPartidos) {
        this.context = context;
        this.listaPartidos = listaPartidos;
    }

    @Override
    public int getCount() {
        return listaPartidos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaPartidos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.activity_lista_partidos, viewGroup, false);
        }

        for (DadosPartidoDTO dadosPartidoDTO : listaPartidos) {
            System.out.println(dadosPartidoDTO.getId());
            System.out.println(dadosPartidoDTO.getNome());
            System.out.println(dadosPartidoDTO.getSigla());
        }

        DadosPartidoDTO dadosPartidoDTO = listaPartidos.get(i);
        TextView tvIdPartido = view.findViewById(R.id.tvIdPartido);
        TextView tvSiglaPartido = view.findViewById(R.id.tvSiglaPartido);
        TextView tvNomePartido = view.findViewById(R.id.tvNomePartido);

//        tvIdPartido.setText(String.valueOf(dadosPartidoDTO.getId()));
//        tvSiglaPartido.setText(String.valueOf(dadosPartidoDTO.getSigla()));
//        tvNomePartido.setText(dadosPartidoDTO.getNome());

        return view;
    }
}