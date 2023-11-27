package com.example.portaldeputadooficial.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class DespesaDTO {
    @JsonProperty("dados")
    private ArrayList<DadosDespesaDTO> dados;

    @JsonProperty("links")
    private List<LinksDTO> links;

    public DespesaDTO() {
    }

    public ArrayList<DadosDespesaDTO> getDados() {
        return dados;
    }

    public void setDados(ArrayList<DadosDespesaDTO> dados) {
        this.dados = dados;
    }

    public List<LinksDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinksDTO> links) {
        this.links = links;
    }
}
