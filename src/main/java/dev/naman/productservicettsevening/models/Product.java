package dev.naman.productservicettsevening.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseModel {
    private String title;
    private double price;
    private String description;
    // P : C
    // 1 -> 1
    // m <- 1
    // M <-> 1

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Category category;
    private String imageUrl;
    private boolean isPublic;
}

// P -> C