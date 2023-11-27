package com.example.portaldeputadooficial.retrofit;

import com.example.portaldeputadooficial.service.IDeputadoService;
import com.example.portaldeputadooficial.service.IPartidoService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {
    private Retrofit retrofit;
    private static final String BASE_URL = "https://dadosabertos.camara.leg.br/api/v2/";

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public IDeputadoService deputadoService() {
        return this.retrofit.create(IDeputadoService.class);
    }

    public IPartidoService partidoService() {
        return this.retrofit.create(IPartidoService.class);
    }
}
