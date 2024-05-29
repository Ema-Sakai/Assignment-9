package com.example.catsdatabase;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    private CatMapper catMapper;

    public CatController(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    @GetMapping("/cats")
    public List<Cat> findByCoats(@RequestParam String coats) {
        return catMapper.findByCoats(coats);
    }
}
