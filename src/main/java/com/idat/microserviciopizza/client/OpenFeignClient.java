package com.idat.microserviciopizza.client;


import com.idat.microserviciopizza.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="elvincardenas-cliente",url = "localhost:50270")
public interface OpenFeignClient {

    @GetMapping("/api/cliente/listar")
    public List<Cliente> listarEstudiantes();
}
