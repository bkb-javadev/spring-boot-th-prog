package com.arsen.services;

import com.arsen.models.Orders;
import com.arsen.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    public Orders findById(Long id) {
        return ordersRepository.findById(id).orElse(null);
    }

    public void save(Orders orders) {
        ordersRepository.save(orders);
    }

    public void deleteById(Long id) {
        ordersRepository.deleteById(id);
    }
}
