package com.example.demo.service;

import com.example.demo.dto.CompressImageRequestDto;
import com.example.demo.dto.ImageRequestDto;
import com.example.demo.dto.SaveImageRequestDto;
import com.example.demo.entity.CompressImage;

public interface ImageService {

    public String saveImage(SaveImageRequestDto imageRequestDto);

    public String compressImage(CompressImageRequestDto compressImage);

}
