package com.recipe.app.model;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ingredient - UnitOfMeasure: 1 - 1, but cannot use @OneToOne here
    // Error: 'One To One' attribute type should not be 'String'
    private String uom; // UnitOfMeasure property: string

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
