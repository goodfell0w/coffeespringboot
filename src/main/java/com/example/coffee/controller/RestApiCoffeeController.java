package com.example.coffee.controller;

import com.example.coffee.entity.Coffee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class RestApiCoffeeController {
    private List<Coffee> coffees = new ArrayList<>();

    public RestApiCoffeeController(){
        coffees.addAll(List.of(
                new Coffee("Cereza"),
                new Coffee("Barista"),
                new Coffee("Tres Pontas"),
                new Coffee("Crema Lareno")
        ));
    }

    @GetMapping("/coffees")
    Iterable<Coffee> getCoffees() {
        return coffees;
    }

    @GetMapping("/coffees/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable UUID id) {
        for (Coffee c: coffees) {
            if (c.getId() == id) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

}
