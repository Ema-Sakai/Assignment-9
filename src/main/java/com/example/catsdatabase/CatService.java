package com.example.catsdatabase;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public List<Cat> findByCoats(String coats) {
        return catMapper.findByCoats(coats);
    }

}
