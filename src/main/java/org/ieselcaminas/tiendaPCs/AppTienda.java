package org.ieselcaminas.tiendaPCs;

import org.ieselcaminas.tiendaPCs.controller.OrdenadorController;
import org.ieselcaminas.tiendaPCs.entity.Ordenador;
import org.ieselcaminas.tiendaPCs.repository.OrdenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AppTienda implements CommandLineRunner {
    @Autowired
    private OrdenadorRepository ordenadorRepository;
    private OrdenadorController ordenadorController;

    public AppTienda(OrdenadorRepository ordenadorRepository, OrdenadorController ordenadorController){
        this.ordenadorRepository = ordenadorRepository;
        this.ordenadorController = ordenadorController;
    }
    public static void main(String[] args) {
        SpringApplication.run(AppTienda.class, args);
    }

    @Override
    public void run(String... args) throws SQLException {
        //ordenadorRepository.findAll().forEach(System.out::println);
        //ordenadorRepository.findByOrderByIdDesc().forEach(System.out::println);
        //ordenadorRepository.findByOrderByPrecioAsc().forEach(System.out::println);
        System.out.println(ordenadorController.ordenar());;
    }

}
