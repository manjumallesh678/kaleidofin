package com.example.demo.service;

import com.example.demo.dto.CompressImageRequestDto;
import com.example.demo.dto.SaveImageRequestDto;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImp implements ImageService{

    @Override
    public String saveImage(SaveImageRequestDto imageRequestDto) {
        Storge storge = new GetStoreFactory().getStorgeFactory(imageRequestDto.getStorgeEnum());

        storge.saveImage();
        return "savedImage";
    }

    @Override
    public String compressImage(CompressImageRequestDto compressImage){

//        if(compressImage.getMax() >= ()){
//
//        }
        return "CompressedImage";
    }


}
