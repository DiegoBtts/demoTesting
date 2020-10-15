package com.example.demoTesting.repositorios;

import com.example.demoTesting.modelos.CategoriaDeProductos;
import com.example.demoTesting.modelos.Impuesto;
import com.example.demoTesting.modelos.Localidad;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RepositorioDeImpuestos extends CrudRepository<Impuesto, Integer> {

    Optional<Impuesto> findByLocalidadAndCategoria(Localidad localidad, CategoriaDeProductos categoria);

}
