package com.example.Proyecto25.controller;

import com.example.Proyecto25.dao.MiDaoInterCliente;
import com.example.Proyecto25.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class MiControllerCliente {

    @Autowired
    private MiDaoInterCliente miDaoInter;

    @GetMapping("/lista_get")
    public List<Cliente> listar()
    {
        return miDaoInter.findAll();
    }

    @GetMapping("/listar/{id}")
    public Optional<Cliente> listar_id(@PathVariable("id") Integer id){
        boolean existe=miDaoInter.existsById(id);
        if(existe){
            return miDaoInter.findById(id);
        }else {
            if(id/10000000==0 || id/10000000>=10){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El numero de caracteres del id es incorrecto");
            }
            else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se ha encontrado el Id solicitado");}
        }


    }

    @PostMapping("/agregar")
    public void agregar(@RequestBody Cliente nuevo){
        miDaoInter.save(nuevo);
    }

    @PutMapping("/lista_put")
    public void actualizar(@RequestBody Cliente nuevo){
        miDaoInter.save(nuevo);
    }
    /*
    @DeleteMapping("/listas/{id}")
    public void eliminar2(@PathVariable("id") Integer id){
        miDaoInter.existsById(id);
    }*/

    @DeleteMapping("/lista/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        miDaoInter.deleteById(id);
    }


    @GetMapping(value = "listar2/{id}")
    public Optional<Cliente> verCliente(@PathVariable("id") Integer id){
        boolean existe2=miDaoInter.existsById(id);
        if(existe2==true){
            return miDaoInter.findById(id);
        }else {
            if(id/100000000==0){

            }else {

            }
        }
        return null;
    }







}
