package dev.naman.productservicettsevening.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
//@Table(name = "naman")
public class Category extends BaseModel {
    private String name;
//    @Column
    private String description;
//    private Dummy dummy;

    // C : P
    // 1 : m
    // 1 : 1
    // 1 : m

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = {CascadeType.REMOVE})
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 1)
    private Set<Product> products;

//    @OneToOne
//    @OneToMany
//    @ManyToOne
//    @ManyToMany

}

// FetchModes allow to solve how a associated object is fetched
// Spring Data JPA modifies the behaviour of FetchModes a lot