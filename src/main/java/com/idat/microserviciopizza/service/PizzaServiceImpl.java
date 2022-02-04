package com.idat.microserviciopizza.service;

import com.idat.microserviciopizza.client.OpenFeignClient;
import com.idat.microserviciopizza.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PizzaServiceImpl implements PizzaService{
    @Autowired
    private OpenFeignClient client;

    @Override
    public List<Cliente> listarCliente() {
        return client.listarEstudiantes();
    }
}
