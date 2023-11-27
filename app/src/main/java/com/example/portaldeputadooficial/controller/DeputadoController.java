package com.example.portaldeputadooficial.controller;

import static com.example.portaldeputadooficial.util.Global.despesaDTO;
import static com.example.portaldeputadooficial.util.Global.listaDeputados;

import com.example.portaldeputadooficial.model.dto.DeputadoDTO;
import com.example.portaldeputadooficial.model.dto.DespesaDTO;
import com.example.portaldeputadooficial.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeputadoController {
    public static void getDeputados() {
        try {
            Call<DeputadoDTO> call = new RetrofitConfig().deputadoService().getDeputados();
            call.enqueue(new Callback<DeputadoDTO>() {
                @Override
                public void onResponse(Call<DeputadoDTO> call, Response<DeputadoDTO> response) {
                    DeputadoDTO deputadoDTO = response.body();
                    listaDeputados.addAll(deputadoDTO.getDados());
                }

                @Override
                public void onFailure(Call<DeputadoDTO> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void getDespesa(long idDeputado) {
        try {
            Call<DespesaDTO> call = new RetrofitConfig().deputadoService().despesabyId(idDeputado);
            call.enqueue(new Callback<DespesaDTO>() {
                @Override
                public void onResponse(Call<DespesaDTO> call, Response<DespesaDTO> response) {
                    despesaDTO = response.body();
                }

                @Override
                public void onFailure(Call<DespesaDTO> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
