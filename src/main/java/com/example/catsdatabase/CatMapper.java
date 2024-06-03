package com.example.catsdatabase;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CatMapper {

    @Select("SELECT * FROM cats WHERE coats LIKE CONCAT('%', #{coats}, '%')")
    List<Cat> findByCoats(String coats);

    @Select("SELECT * FROM cats WHERE id = #{id}")
    Optional<Cat> findById(Integer id);
}
