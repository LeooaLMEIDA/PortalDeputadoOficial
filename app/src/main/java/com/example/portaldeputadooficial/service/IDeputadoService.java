package com.example.portaldeputadooficial.service;

import com.example.portaldeputadooficial.model.dto.DeputadoDTO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IDeputadoService {
    @GET("deputados")
    Call<DeputadoDTO> getDeputados();
}
