package com.example.catsdatabase;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    private CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> findByCoats(@RequestParam String coats) {
        return catService.findByCoats(coats);
    }
}
