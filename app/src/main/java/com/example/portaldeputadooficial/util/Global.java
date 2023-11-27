package com.example.portaldeputadooficial.util;

import com.example.portaldeputadooficial.model.dto.DadosDeputadoDTO;
import com.example.portaldeputadooficial.model.dto.DadosPartidoDTO;
import com.example.portaldeputadooficial.model.dto.DespesaDTO;

import java.util.ArrayList;

public class Global {
    public static ArrayList<DadosDeputadoDTO> listaDeputados = new ArrayList<>();
    public static ArrayList<DadosPartidoDTO> listaPartidos = new ArrayList<>();
    public static DespesaDTO despesaDTO = new DespesaDTO();
}
