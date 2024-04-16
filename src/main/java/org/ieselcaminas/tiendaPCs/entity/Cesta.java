package org.ieselcaminas.tiendaPCs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Cesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private Long idCliente;
    private Long idArticulo;

    public Cesta() {
    }

    public Cesta(Long id, Date fecha, Long idCliente, Long idArticulo) {
        this.id = id;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idArticulo = idArticulo;
    }

    public Cesta(Date fecha, Long idCliente, Long idArticulo) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idArticulo = idArticulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", idCliente=" + idCliente +
                ", idArticulo=" + idArticulo +
                '}';
    }
}
