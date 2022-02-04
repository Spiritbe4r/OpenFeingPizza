package com.idat.microserviciopizza.controller;

import com.idat.microserviciopizza.model.Cliente;
import com.idat.microserviciopizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzaController {

    @Autowired
    private PizzaService service;

    @GetMapping("/listar")
    public List<Cliente> listarCliente(){
        return service.listarCliente();
    }
}
