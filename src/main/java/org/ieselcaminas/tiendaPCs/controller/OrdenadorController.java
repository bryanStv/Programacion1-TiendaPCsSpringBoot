package org.ieselcaminas.tiendaPCs.controller;

import org.ieselcaminas.tiendaPCs.entity.Ordenador;
import org.ieselcaminas.tiendaPCs.repository.OrdenadorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdenadorController {
    public OrdenadorRepository ordenadorRepository;

    public OrdenadorController(OrdenadorRepository ordenadorRepository){
        this.ordenadorRepository = ordenadorRepository;
    }

    public List<Ordenador> ordenar(){
        List<Ordenador> ordenadors = ordenadorRepository.findByOrderByIdAsc();
        return ordenadors;
    }
}
