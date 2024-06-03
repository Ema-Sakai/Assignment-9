package com.example.catsdatabase;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService {

    private CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public List<Cat> findByCoats(String coats) {
        return catMapper.findByCoats(coats);
    }

    public Cat findCat(Integer id) {
        Optional<Cat> cat = catMapper.findById(id);
        if (cat.isPresent()) {
            return cat.get();
        } else {
            throw new CatNotFoundException("そのIDは存在しません。");
        }
    }
}
