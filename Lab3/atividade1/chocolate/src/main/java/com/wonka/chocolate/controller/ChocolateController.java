package com.wonka.chocolate.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.wonka.chocolate.domain.ChocolateDTO;


@RestController
@RequestMapping("/chocolate")
public class ChocolateController {
    public List<ChocolateDTO> chocolates = new ArrayList<>();
    
    public ChocolateController (){
        chocolates.addAll(List.of(
                new ChocolateDTO("Choquito","Nestlé",0.2, 5.50),
                new ChocolateDTO("Caribe","Garoto",0.3, 5.60),
                new ChocolateDTO("Laka","Lacta",0.15, 5.60),
                new ChocolateDTO("Hersheys","Cookie and Cream",0.3, 5.80)));
    }
    @GetMapping
        Iterable<ChocolateDTO> getChocolateDTO(){
        return chocolates;
    }
    
    @GetMapping("/{id}")
    ResponseEntity<ChocolateDTO> getChocolateByID(@PathVariable Long id) {
        for (ChocolateDTO c : chocolates){
            if (id.equals(c.getId()))
                return ResponseEntity.ok(c);
        }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping
    ResponseEntity<ChocolateDTO> postChocolate(@RequestBody ChocolateDTO chocolateDTO) {
        long idEncontrado = chocolateDTO.getMaiorId(chocolates);
        chocolateDTO.setId(idEncontrado);
        chocolates.add(chocolateDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(chocolateDTO);
    }

    @PutMapping("/{id}")
    ResponseEntity<ChocolateDTO> putChocolate(@PathVariable Long id, @RequestBody ChocolateDTO chocolate) {
            int chocolateIndex = 0;
            for (ChocolateDTO c : chocolates) {
                if (c.getId().equals(id)) {
                    chocolateIndex = chocolates.indexOf(c);
                    chocolates.set(chocolateIndex, chocolate);
                }
            }
            return (chocolateIndex == 0) ?
                ResponseEntity.status(HttpStatus.CREATED).body(chocolate) :
                ResponseEntity.ok(chocolate);
    }

    @DeleteMapping("/{id}")
    void deleteChocolate(@PathVariable Long id) {
        chocolates.removeIf(c -> c.getId() == id);
    }
}