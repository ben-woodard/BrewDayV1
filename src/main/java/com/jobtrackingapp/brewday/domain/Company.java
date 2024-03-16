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
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String companyName;
    @OneToMany(mappedBy = "company", orphanRemoval = true, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Brand> brands;

    //    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", orphanRemoval = true)
//    @JsonIgnore
//    private List<Message> messages = new ArrayList<>();
}
