package org.ieselcaminas.tiendaPCs.repository;

import org.ieselcaminas.tiendaPCs.entity.Ordenador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface OrdenadorRepository extends CrudRepository<Ordenador, Long>{
    List<Ordenador> findByOrderByIdDesc();
    List<Ordenador> findByOrderByIdAsc();
    List<Ordenador> findByOrderByPrecioDesc();
    List<Ordenador> findByOrderByPrecioAsc();
}
