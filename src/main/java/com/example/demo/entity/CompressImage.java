package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompressImage {

    @Id
    String id;

    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "compressedImage",nullable = false)
    Object image;
}
