package com.example.Proyecto25.dao;

import com.example.Proyecto25.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiDaoInterProducto extends JpaRepository<Producto,Integer> {
}
