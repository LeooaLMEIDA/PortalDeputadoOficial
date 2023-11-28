package com.example.portaldeputadooficial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.portaldeputadooficial.R;
import com.example.portaldeputadooficial.model.dto.DadosDespesaDTO;
import java.util.ArrayList;

public class AdapterDespesa extends BaseAdapter {

    private Context context;
    private ArrayList<DadosDespesaDTO> listaDespesas;

    public AdapterDespesa(Context context, ArrayList<DadosDespesaDTO> listaDespesas) {
        this.context = context;
        this.listaDespesas = listaDespesas;
    }

    @Override
    public int getCount() {
        return listaDespesas.size();
    }

    @Override
    public Object getItem(int i) {
        return listaDespesas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_item_lista_despesa, viewGroup, false);
        }

        DadosDespesaDTO despesaDTO = listaDespesas.get(i);
        TextView tvTipoDespesa = view.findViewById(R.id.tvTipoDespesa);
        TextView tvFornecedor = view.findViewById(R.id.tvFornecedor);
        TextView tvDataDoc = view.findViewById(R.id.tvDataDoc);
        TextView tvValor = view.findViewById(R.id.tvValor);

        tvTipoDespesa.setText(despesaDTO.getTipoDespesa());
        tvFornecedor.setText(despesaDTO.getNomeFornecedor());
        tvDataDoc.setText(despesaDTO.getDataDocumento());
        tvValor.setText(String.valueOf(despesaDTO.getValorDocumento()));

        return view;
    }
}
