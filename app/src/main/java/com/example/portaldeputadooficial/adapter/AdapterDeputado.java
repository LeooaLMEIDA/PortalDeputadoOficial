package com.example.portaldeputadooficial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.model.dto.DadosDeputadoDTO;
import java.util.ArrayList;

public class AdapterDeputado extends BaseAdapter {

    private Context context;
    private ArrayList<DadosDeputadoDTO> listaDeputados;

    public  Context getContext(){
        return context;
    }

    public ArrayList<DadosDeputadoDTO> getListaDeputados(){
        return listaDeputados;
    }

    public AdapterDeputado(Context context, ArrayList<DadosDeputadoDTO> listaDeputados) {
        this.context = context;
        this.listaDeputados = listaDeputados;
    }

    @Override
    public int getCount() {
        return listaDeputados.size();
    }

    @Override
    public Object getItem(int i) {
        return listaDeputados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.activity_item_lista_deputado, viewGroup, false);
        }

        DadosDeputadoDTO dadosDeputadoDTO = listaDeputados.get(i);
        TextView tvIdDeputado = view.findViewById(R.id.tvIdDeputado);
        TextView tvNomeDeputado = view.findViewById(R.id.tvNomeDeputado);
        TextView tvPartido = view.findViewById(R.id.tvPartido);

        tvIdDeputado.setText(String.valueOf(dadosDeputadoDTO.getId()));
        tvNomeDeputado.setText(dadosDeputadoDTO.getNome());
        tvPartido.setText(dadosDeputadoDTO.getSiglaPartido());

        return view;
    }
}
