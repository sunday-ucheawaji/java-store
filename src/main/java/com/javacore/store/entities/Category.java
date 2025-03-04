package com.javacore.store.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name= "categories")
public class Category {

    @Id
    @Column(name="id")
    private Byte id;

    @Column(name="name")
    private String name;

    @OneToOne(mappedBy = "category")
    @Builder.Default
    private List<Product> products = new ArrayList<>();

}
