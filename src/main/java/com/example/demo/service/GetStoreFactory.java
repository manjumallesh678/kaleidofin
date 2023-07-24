package com.example.demo.service;

import com.example.demo.dto.StorgeEnum;

public class GetStoreFactory {

    public Storge getStorgeFactory(StorgeEnum store){

        if(store == null){
            return null;
        }
        else if(store == StorgeEnum.S3){
            return new SaveToS3();
        }
        else if(store == StorgeEnum.BLOB_STORGE){
            return new SaveBlobStore();
        }
        else{
            return new SaveToGoogleCloud();
        }

    }

}
