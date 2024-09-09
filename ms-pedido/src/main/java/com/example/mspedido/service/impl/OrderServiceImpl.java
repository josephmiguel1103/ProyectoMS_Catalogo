package com.example.mspedido.service.impl;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.repository.OrderRepository;
import com.example.mspedido.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Pedido> list() {
        return orderRepository.findAll();
    }

    @Override
    public Pedido save(Pedido pedido) {
        return orderRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> findById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Pedido update(Pedido pedido) {
        return orderRepository.save(pedido);
    }
}
