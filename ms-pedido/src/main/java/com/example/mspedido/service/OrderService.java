package com.example.mspedido.service;

import com.example.mspedido.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public List<Pedido> list();

    public Pedido save(Pedido pedido);

    public Optional<Pedido> findById(Integer id);

    public void delete(Integer id);

    public Pedido update(Pedido pedido);
}
