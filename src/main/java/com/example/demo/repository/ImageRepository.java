package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ImageRepository {

    public String saveImage(){
        return "saved";
    }

}
