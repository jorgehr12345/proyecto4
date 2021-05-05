package com.example.Proyecto25.dao;

import com.example.Proyecto25.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiDaoInterCliente extends JpaRepository<Cliente,Integer> {

}
