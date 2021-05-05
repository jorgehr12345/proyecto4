package com.example.Proyecto25.controller;

import com.example.Proyecto25.dao.MiDaoInterProducto;
import com.example.Proyecto25.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MiControllerProducto {
    @Autowired
    MiDaoInterProducto daoInterProducto;

    @GetMapping(value="/listar_prod2")
    public String listar(Model model){
        model.addAttribute("productos",daoInterProducto.findAll());
        return "productos/ver_productos";
    }


    @GetMapping(value = "/listar_prod")
    public List<Producto> listaProductos(){
        return daoInterProducto.findAll();
    }

    @PostMapping("/agregar_prod")
    public void agregar(@RequestBody Producto nuevo){
        daoInterProducto.save(nuevo);
    }

    @PutMapping("/actualizar_prod")
    public void actualizar(@RequestBody Producto nuevo){
        daoInterProducto.save(nuevo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        daoInterProducto.deleteById(id);
    }

}
