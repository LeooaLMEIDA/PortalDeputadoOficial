package com.example.portaldeputadooficial.controller;

import static com.example.portaldeputadooficial.util.Global.listaPartidos;

import com.example.portaldeputadooficial.model.dto.DadosPartidoDTO;
import com.example.portaldeputadooficial.model.dto.PartidoDTO;
import com.example.portaldeputadooficial.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PartidoController {
    public static void getPartidos() {
        try {
            Call<PartidoDTO> call = new RetrofitConfig().partidoService().getPartidos();
            call.enqueue(new Callback<PartidoDTO>() {
                @Override
                public void onResponse(Call<PartidoDTO> call, Response<PartidoDTO> response) {
                    PartidoDTO partidoDTO = response.body();
                    listaPartidos.addAll(partidoDTO.getDados());
                    for (DadosPartidoDTO dadosPartidoDTO : listaPartidos) {
                        System.out.println(dadosPartidoDTO.getNome());
                    }
                }

                @Override
                public void onFailure(Call<PartidoDTO> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
