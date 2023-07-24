package com.example.demo.controller;


import com.example.demo.dto.CompressImageRequestDto;
import com.example.demo.dto.ImageRequestDto;
import com.example.demo.dto.SaveImageRequestDto;
import com.example.demo.entity.CompressImage;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image-service/v1")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/savedImage")
    public ResponseEntity saveImage(@RequestBody SaveImageRequestDto imageRequestDto){
        String url = imageService.saveImage(imageRequestDto);
        return ResponseEntity.ok(url);
    }

    @PostMapping("/compressImage")
    public ResponseEntity compressImage(@RequestBody CompressImageRequestDto compressImageRequestDto){
        String url = imageService.compressImage(compressImageRequestDto);
        return ResponseEntity.ok(url);
    }

}
