package com.example.portaldeputadooficial.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class DeputadoDTO {
    @JsonProperty("dados")
    private ArrayList<DadosDeputadoDTO> dados;

    @JsonProperty("links")
    private List<LinksDTO> links;

    public List<LinksDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinksDTO> links) {
        this.links = links;
    }

    public DeputadoDTO() {
    }

    public DeputadoDTO(ArrayList<DadosDeputadoDTO> dados) {
        this.dados = dados;
    }

    public ArrayList<DadosDeputadoDTO> getDados() {
        return dados;
    }

    public void setDados(ArrayList<DadosDeputadoDTO> dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "DeputadoDTO{" +
                "dados=" + dados +
                ", links=" + links +
                '}';
    }
}
