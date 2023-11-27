package com.example.portaldeputadooficial.service;

import com.example.portaldeputadooficial.model.dto.PartidoDTO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPartidoService {
    @GET("partidos")
    Call<PartidoDTO> getPartidos();
}
