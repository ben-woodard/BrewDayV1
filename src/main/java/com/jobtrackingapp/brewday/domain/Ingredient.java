package com.jobtrackingapp.brewday.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;
    private String ingredientName;
    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;
    private BigDecimal price;
    private Double amountInStock;
    @Enumerated(EnumType.STRING)
    @Column(name="ingredientType")
    private ingredientType ingredientType;
    private enum ingredientType {
        MALT,
        HOP,
        ADJUNCT,
        EXTRACTS,
        SALT
    }
    @Enumerated(EnumType.STRING)
    @Column(name="unitOfMeasurement")
    private unitOfMeasurement unitOfMeasurement;
    private enum unitOfMeasurement {
        lBS,
        OZ
    }
}
