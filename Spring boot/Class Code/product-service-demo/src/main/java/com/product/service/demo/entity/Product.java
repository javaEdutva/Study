package com.product.service.demo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Validated
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    @Column(name = "description", length = 1000)
    private String description;
    private Double price;
    private String category;
    private String image;

    @Column(unique = true)
    @NotNull(message = "Email can't be null")
    private String email;

    private Character active='T';

    @Transient
    private Rating rating;

    @JsonManagedReference
//    @ToString.Exclude
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Rating> productRating;

}
