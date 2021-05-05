package com.example.Proyecto25.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="productos")
public class Producto {
    @Id
    private Integer id;
    @Column(name="nombre_producto",length = 20)
    private String nombre;
    @Column(name="fecha_venc",length = 15)
    private String vencimiento;

    @ManyToMany(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "producto_cliente",
        joinColumns = @JoinColumn(name="id_producto",nullable = false),
        inverseJoinColumns = @JoinColumn(name="id_cliente",nullable = false)
    )
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
}
