package org.ieselcaminas.tiendaPCs.repository;

import org.ieselcaminas.tiendaPCs.entity.Ordenador;
import org.springframework.data.repository.CrudRepository;

import java.sql.SQLException;
import java.util.List;

public interface OrdenadorRepository extends CrudRepository<Ordenador, Long>{
    List<Ordenador> findOrdenadorByPortatilContaining(int isPortatil) throws SQLException;
    List<Ordenador> findOrdenadorByCpu(String cpu) throws SQLException;
    Ordenador findById(long id) throws SQLException;
}
