package com.jobtrackingapp.brewday.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;
    private String brandName;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @OneToMany(mappedBy = "brand", orphanRemoval = true, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Batch> batches;



//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//

}
