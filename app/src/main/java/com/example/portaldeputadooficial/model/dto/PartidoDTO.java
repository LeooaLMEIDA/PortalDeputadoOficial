package com.example.portaldeputadooficial.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PartidoDTO {
    @JsonProperty("dados")
    private ArrayList<DadosPartidoDTO> dados;

    @JsonProperty("links")
    private List<LinksDTO> links;


    public PartidoDTO() {
    }

    public Collection<? extends DadosPartidoDTO> getDados() {
        return dados;
    }

    public void setDados(ArrayList<DadosPartidoDTO> dados) {
        this.dados = dados;
    }

    public List<LinksDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinksDTO> links) {
        this.links = links;
    }

    public static class StatusDto {
    }
}
