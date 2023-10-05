package dev.naman.productservicettsevening.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
