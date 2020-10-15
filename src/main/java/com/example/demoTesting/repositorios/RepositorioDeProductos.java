package com.example.demoTesting.repositorios;

import com.example.demoTesting.modelos.Producto;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioDeProductos extends CrudRepository<Producto, Integer> {
}
