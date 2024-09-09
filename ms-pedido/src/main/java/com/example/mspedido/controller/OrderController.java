package com.example.mspedido.controller;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Pedido>> getAll() {
        return ResponseEntity.ok(orderService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pedido>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(orderService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(orderService.save(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> update(@PathVariable Integer id,
                                         @RequestBody Pedido pedido) {
        pedido.setId(id);
        return ResponseEntity.ok(orderService.save(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pedido>> delete(@PathVariable Integer id) {
        orderService.delete(id);
        return ResponseEntity.ok(orderService.list());
    }
}
