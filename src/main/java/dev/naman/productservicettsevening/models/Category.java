package dev.naman.productservicettsevening.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
//@Table(name = "naman")
public class Category extends BaseModel {
    private String name;
//    @Column
    private String description;

    // C : P
    // 1 : m
    // 1 : 1
    // 1 : m

    @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
    private List<Product> products;

//    @OneToOne
//    @OneToMany
//    @ManyToOne
//    @ManyToMany

}
