package com.arsen.controllers;

import com.arsen.models.Orders;
import com.arsen.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("orders", ordersService.findAll());
        return "main";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Long id, Model model) {
        model.addAttribute("order", ordersService.findById(id));
        return "show";
    }


    @GetMapping("/save")
    public String form(@ModelAttribute("orders") Orders orders) {
        return "save";
    }

    @PostMapping
    public String save(@ModelAttribute("orders") Orders orders) {
        ordersService.save(orders);
        return "redirect:/order";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        ordersService.deleteById(id);

        return "redirect:/order";
    }

}
