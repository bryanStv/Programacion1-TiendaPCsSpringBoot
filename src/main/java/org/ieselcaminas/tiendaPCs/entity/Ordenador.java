package org.ieselcaminas.tiendaPCs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ordenador {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int portatil;
    private String cpu;
    private int ram;
    private String gpu;
    private float precio;

    public Ordenador() {
    }

    public Ordenador(Long id, String marca, String modelo, int portatil, String cpu, int ram, String gpu, float precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.portatil = portatil;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.precio = precio;
    }

    public Ordenador(String marca, String modelo, int portatil, String cpu, int ram, String gpu, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.portatil = portatil;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPortatil() {
        return portatil;
    }

    public void setPortatil(int portatil) {
        this.portatil = portatil;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        if(this.portatil == 0){
            return String.format("Sobremesa id-->%d\n\tmarca: %s\n\tmodelo: %s\n\tCPU: %s GPU:%s RAM:%sGB\n\tprecio: %f€",this.id,this.marca,this.modelo,this.cpu,this.gpu,this.ram,this.precio);
        }else{
            return String.format("Portatil id-->%d\n\tmarca: %s\n\tmodelo: %s\n\tCPU: %s GPU:%s RAM:%sGB\n\tprecio: %f€",this.id,this.marca,this.modelo,this.cpu,this.gpu,this.ram,this.precio);
        }
    }
}
