package com.example.portaldeputadooficial.service;

import com.example.portaldeputadooficial.model.dto.DeputadoDTO;
import com.example.portaldeputadooficial.model.dto.DespesaDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IDeputadoService {
    @GET("deputados")
    Call<DeputadoDTO> getDeputados();

    @GET("deputados/{id}/despesas")
    Call<DespesaDTO> despesabyId(@Path("id") long id);
}
