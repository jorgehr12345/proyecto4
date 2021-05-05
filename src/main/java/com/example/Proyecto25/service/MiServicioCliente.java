package com.example.Proyecto25.service;

import com.example.Proyecto25.dao.MiDaoInterCliente;
import com.example.Proyecto25.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiServicioCliente implements MiServicioInterCliente {
    @Autowired
    public MiDaoInterCliente daoInter;
    @Override
    public void func(Cliente cliente){
        daoInter.save(cliente);
    }
}
