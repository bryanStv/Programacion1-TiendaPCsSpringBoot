package org.ieselcaminas.tiendaPCs.repository;

import org.ieselcaminas.tiendaPCs.entity.Ordenador;
import org.springframework.data.repository.CrudRepository;

import java.sql.SQLException;
import java.util.List;

public interface OrdenadorRepository extends CrudRepository<Ordenador, Long>{
    List<Ordenador> findOrdenadorsByPortatilContaining(int isPortatil) throws SQLException;
    List<Ordenador> findOrdenadorsByCpu(String cpu) throws SQLException;
    Ordenador findById(long id) throws SQLException;
}
