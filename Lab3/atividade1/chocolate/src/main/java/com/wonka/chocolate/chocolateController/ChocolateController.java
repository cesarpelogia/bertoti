package com.wonka.chocolate.chocolateController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wonka.chocolate.chocolateDomain.ChocolateDTO;

@RestController
@RequestMapping("/chocolate")
public class ChocolateController {

    private List<ChocolateDTO> chocolates = new ArrayList<>();

    public ChocolateController() {
        chocolates.addAll(List.of(
            new ChocolateDTO( "Chocolate ao Leite", "Garoto", 5.99, 100.0),
            new ChocolateDTO( "Chocolate Amargo", "Nestlé", 6.99, 90.0),
            new ChocolateDTO( "Chocolate Branco", "Lacta", 7.99, 110.0),
            new ChocolateDTO( "Chocolate com Avelã", "Cacau Show", 8.99, 120.0)));
        chocolates.forEach(chocolate -> System.out.println(chocolate));
    }
    
    @GetMapping
    public Iterable<ChocolateDTO> getAllChocolates() {
        return chocolates;
    }
    
    @GetMapping("/{id}")
    public Optional<ChocolateDTO> getChocolateById(@PathVariable Long id) {
        return chocolates.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    @PostMapping
    public ChocolateDTO postChocolate(@RequestBody ChocolateDTO newChocolateDTO) {
        chocolates.add(newChocolateDTO);
        return newChocolateDTO;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ChocolateDTO> putChocolateDTO(@PathVariable Long id, @RequestBody ChocolateDTO chocolate) {
        Optional<ChocolateDTO> existingChocolate = chocolates.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (existingChocolate.isPresent()) {
            int index = chocolates.indexOf(existingChocolate.get());
            chocolates.set(index, chocolate);
            return new ResponseEntity<>(chocolate, HttpStatus.OK);
        } else {
            chocolates.add(chocolate);
            return new ResponseEntity<>(chocolate, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteChocolate(@PathVariable Long id) {
        chocolates.removeIf(c -> c.getId().equals(id));
    }
}