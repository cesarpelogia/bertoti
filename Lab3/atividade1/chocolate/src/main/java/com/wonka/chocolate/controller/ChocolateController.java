package com.wonka.chocolate.controller;

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

import com.wonka.chocolate.domain.ChocolateDTO;
// import com.wonka.chocolate.service.ChocolateService;

@RestController
@RequestMapping("/chocolate")
public class ChocolateController {
    public List<ChocolateDTO> chocolates = new ArrayList<>();
    // @Autowired
    // private ChocolateService chocolateService;
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
    
    @PostMapping
    ChocolateDTO postChocolate(@RequestBody ChocolateDTO chocolateDTO) {
        chocolates.add(chocolateDTO);
        return chocolateDTO;
    }
    @PutMapping("/{id}")
    public ResponseEntity<ChocolateDTO> putChocolate(@PathVariable Long id, @RequestBody ChocolateDTO chocolate) {
        Optional<ChocolateDTO> existingChocolate = chocolates.stream()
            .filter(c -> c.getId().equals(id))
            .findFirst();
    
        if (existingChocolate.isPresent()) {
            int chocolateIndex = chocolates.indexOf(existingChocolate.get());
            chocolates.set(chocolateIndex, chocolate);
            return ResponseEntity.ok(chocolate);
        } else {
            return new ResponseEntity<>(postChocolate(chocolate), HttpStatus.CREATED);
        }
    }
    
    @DeleteMapping("/{id}")
    void deleteChocolate(@PathVariable long id) {
        chocolates.removeIf(c -> c.getId() == id);
    }
}